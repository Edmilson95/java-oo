package br.com.bytebank.banco.modelo;
	// seria uma especie de dominio unico no mundo inteiro (bytebank.com.br)

//br.com.bytebank.banco.modelo.CalculadorDeImposto => FQN (nome da classe)
public class CalculadorDeImposto {
	private double totalImposto;
	
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}
	
}
