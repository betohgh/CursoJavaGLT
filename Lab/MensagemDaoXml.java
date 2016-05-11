package lab;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MensagemDaoXml {
// passo 6 define atributo estático
	static String DIRETORIO = "Mensagem/";
			
// passo 7 copia da pasta worlspace/resources o código de inicalização estático.
			public MensagemDaoXml(){
				
	        File tDir = new File(DIRETORIO);
	        if (!tDir.exists())
	            if (!tDir.mkdirs())
	                throw new IllegalArgumentException("Erro na criação do diretório " + DIRETORIO);
			}
// passo 8 ler mensagem long pNumero
			Mensagem ler (long pNumero) {
		        try
		        {
		            // Verificando se a mensagem não existe na base de dados
		            File tArquivo = new File(DIRETORIO + pNumero + ".xml");
		            if (! tArquivo.exists())
		            {
		                // Retorno de indicativo de chave não existente
		                return null;
		            }

		            // Abrindo o arquivo para leitura
		            FileInputStream tArq1 = new FileInputStream(tArquivo);
		            XMLDecoder tArq2 = new XMLDecoder(tArq1);

		            // Lendo as informações no arquivo em um objeto auxiliar
		            Mensagem tMensagem = (Mensagem) tArq2.readObject();

		            // Fechando o arquivo
		            tArq2.close();

		            // Retornando o objeto lido
		            return tMensagem;
		        }
		        // Capturando a exceção de I/O e tratando
		        catch (IOException tExcept)
		        {
		            // Retorno de indicativo de erro de I/O
		            tExcept.printStackTrace();
		            return null;
		        }
		    //método do gravar mensagem do passo 8
			}
			boolean gravar (Mensagem pMensagem){
			//código copiado do gravar msg txt passo 8
		        // Obtendo a chave e o tipo para a gravação
		        long tChave = pMensagem.getNumero();

		        try
		        {
		            // Verificando se a mensagem existe na base de dados
		            File tArquivo = new File(DIRETORIO + tChave + ".xml");
		            if (tArquivo.exists())
		            {
		                // Retorno de indicativo de chave duplicada
		                return false;
		            }

		            // Abrindo o arquivo para gravação
		            FileOutputStream tArq1 = new FileOutputStream(tArquivo);
		            XMLEncoder tArq2 = new XMLEncoder(tArq1);

		            // Gravando as informações no arquivo
		            try
		            {
		                Thread.sleep(250);
		            }
		            catch (InterruptedException Except)
		            {
		                Except.printStackTrace();
		                System.exit(9);
		            }
		            tArq2.writeObject(pMensagem);

		            // Fechando o arquivo
		            tArq2.close();

		            // Retornando o indicativo de sucesso
		            return true;
		        }
		        // Capturando a exceção de I/O e tratando
		        catch (IOException tExcept)
		        {
		            // Retorno de indicativo de erro de I/O
		            tExcept.printStackTrace();
		            return false;
		        }

			}
			// método excluir msg passo 8
			boolean excluir (long pNumero){
		        // Verificando se a mensagem não existe na base de dados
		        File tArquivo = new File(DIRETORIO + pNumero + ".xml");
		        if (!tArquivo.exists())
		        {
		            // Retorno de indicativo de chave não existente
		            return false;
		        }

		        // Excluindo o arquivo
		        if (!tArquivo.delete())
		        {
		            // Retorno de indicativo de erro de exclusão
		            return false;
		        }

		        // Retornando o indicativo de sucesso
		        return true;
			}
			
}

	        

