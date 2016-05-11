package lab;

public class Mensagem {
long numero;
String origem;
String destino;
String assunto;
String texto;

// passo 3 getters e setters

public long getNumero() {
	return numero;
}
public void setNumero(long numero) {
	this.numero = numero;
}
public String getOrigem() {
	return origem;
}
public void setOrigem(String origem) {
	this.origem = origem;
}
public String getDestino() {
	return destino;
}
public void setDestino(String destino) {
	this.destino = destino;
}
public String getAssunto() {
	return assunto;
}
public void setAssunto(String assunto) {
	this.assunto = assunto;
}
public String getTexto() {
	return texto;
}
public void setTexto(String texto) {
	this.texto = texto;
}

// passo 4 função
boolean validarDestino (String pDestino){
	if (getDestino().equals(pDestino))  {
		return true;
	} else{
		return false;
	}
		// passo 5 equals e Hashes
	}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((assunto == null) ? 0 : assunto.hashCode());
	result = prime * result + ((destino == null) ? 0 : destino.hashCode());
	result = prime * result + (int) (numero ^ (numero >>> 32));
	result = prime * result + ((origem == null) ? 0 : origem.hashCode());
	result = prime * result + ((texto == null) ? 0 : texto.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Mensagem other = (Mensagem) obj;
	if (assunto == null) {
		if (other.assunto != null)
			return false;
	} else if (!assunto.equals(other.assunto))
		return false;
	if (destino == null) {
		if (other.destino != null)
			return false;
	} else if (!destino.equals(other.destino))
		return false;
	if (numero != other.numero)
		return false;
	if (origem == null) {
		if (other.origem != null)
			return false;
	} else if (!origem.equals(other.origem))
		return false;
	if (texto == null) {
		if (other.texto != null)
			return false;
	} else if (!texto.equals(other.texto))
		return false;
	return true;
}
}

