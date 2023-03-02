package br.com.bytebank.banco.modelo;

public class Conexao implements AutoCloseable {
	
	public Conexao() {
		System.out.println("Abrindo conexão");
		throw new IllegalStateException();
	}
	
	public void LeDados() {
		System.out.println("Recebendo dados");
		throw new IllegalStateException();
	}
	

	@Override
	public void close() {
		System.out.println("Fechando conexão");		
	}
}
