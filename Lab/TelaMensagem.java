package lab;

import utilitarios.Leitor;

public class TelaMensagem {

	public static void main(String[] args) {
		int opcao = 0;
		while (opcao != 9) {
        System.out.println ();
        System.out.println ("SIC - Sistema Interno de Correio");
        System.out.println ("      Módulo Mensagem");
        System.out.println ();
        System.out.println ("1 - Enviar uma Mensagem");
        System.out.println ("2 - Receber uma Mensagem");
        System.out.println ("3 - Remover uma Mensagem");
        System.out.println ("4 - Relação de Mensagens");
        System.out.println ("9 - Saída do Módulo");
        System.out.println ();
        System.out.println ("Entre com a opção desejada : ");
		
		
        opcao = Leitor.readInt();
        
        switch (opcao) {
        
        case 1:
        	System.out.println("Enviar uma Mensagem");
        	realizarEnvioMensagem();
        	break;
        	
        case 2:
        	System.out.println("Receber uma Mensagem");
        	realizarRecebimentoMensagem();	
        	break;
        	
        case 3:
        	System.out.println("Remover uma Mensagem");
        	realizarRemocaoMensagem();
        	break;
        	
        case 4:
        	System.out.println("Relação de Mensagens");
        	obterRelacaoMensagens();
        	break;
			
        case 9:
        	break;
        	
		default:
			break;
		}
	}
}
    static void realizarEnvioMensagem ()
    {
        System.out.println();
        System.out.println("SIC - Sistema Interno de Correio");
        System.out.println("      Módulo Mensagem");
        System.out.println("      Envio de Mensagem");
        System.out.println();

        String tContaDestino = Leitor.readString("Conta Destino       : ");
        if (tContaDestino.equals(""))
            return;

        String tAssunto = Leitor.readString("Assunto             : ");
        String tTexto = Leitor.readString("Texto               : ");

        System.out.println();
        char tConf = Leitor.readChar("Confirma (s/n)      : ");
        System.out.println();

        if (tConf == 'S' || tConf == 's')
        {
            //
            // Colocar a chamada à camada controller
            //
            System.out.println("Chamando a camada de serviços...");
            return;
        }
        System.out.println("Operação não realizada...");
        return;
    }

    static void realizarRecebimentoMensagem ()
    {
        System.out.println();
        System.out.println("SIC - Sistema Interno de Correio");
        System.out.println("      Módulo Mensagem");
        System.out.println("      Recebimento de Mensagem");
        System.out.println();

        long tNumero = Leitor.readLong("Número da Mensagem  : ");
        if (tNumero == 0)
            return;

        System.out.println();
        char tConf = Leitor.readChar("Confirma (s/n)      : ");
        System.out.println();

        if (tConf == 'S' || tConf == 's')
        {
            //
            // Colocar a chamada à camada controller
            //
            System.out.println("Chamando a camada de serviços...");
            return;
        }
        System.out.println("Operação não realizada...");
        return;
    }

    static void realizarRemocaoMensagem()
    {
        System.out.println();
        System.out.println("SIC - Sistema Interno de Correio");
        System.out.println("      Módulo Mensagem");
        System.out.println("      Remoção de Mensagem");
        System.out.println();

        long tNumero = Leitor.readLong("Número da Mensagem  : ");
        if (tNumero == 0)
            return;

        System.out.println();
        char tConf = Leitor.readChar("Confirma (s/n)      : ");
        System.out.println();

        if (tConf == 'S' || tConf == 's')
        {
            //
            // Colocar a chamada à camada controller
            //
            System.out.println("Chamando a camada de serviços...");
            return;
        }
        System.out.println("Operação não realizada...");
        return;
    }

    static void obterRelacaoMensagens()
    {
        System.out.println();
        System.out.println("SIC - Sistema Interno de Correio");
        System.out.println("      Módulo Mensagem");
        System.out.println("      Relação de Mensagens");
        System.out.println();

        //
        // Colocar a chamada à camada controller
        //
        System.out.println("Chamando a camada de serviços...");
        return;
    }

}
