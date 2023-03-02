package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * Classe que representa uma moldura de Conta
 * 
 * @author Edmilson Ferreira
 *
 */

public abstract class Conta extends Object implements Comparable<Conta>, Serializable{

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	/**
	 * Construtor para inicializar o objeto Conta a partir da agencia e do numero.
	 * 
	 * @param agencia
	 * @param numero
	 */
	
	//Construtor
	public Conta (int agencia, int numero) {
		Conta.total++;
		//System.out.println("O total de contas é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		//this.saldo = 100;
		//System.out.println("Conta: " + this.numero +
		//		" Agencia: " + this.agencia);
	}
	
	//Métodos
	public abstract void deposita(double valor);

	/**
	 * Valor precisa ser maior que o saldo.
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public void saca (double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		} 
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
	}
	
	public double getSaldo() {
		return this.saldo; //só retorna o saldo
	}
	
	public int getNumero() {
		return this.numero; //só retorna o numero
	}
	
	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Não pode número menor ou igual a 0.");
			return;
		}
		this.numero = numero; //modifica o numero
	}
	
	public int getAgencia() {
		return this.agencia; //só retorna a agencia
	}
	
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não pode valores menor ou igual a 0.");
			return;
		}
		this.agencia = agencia; //modifica a agencia
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
	@Override
	public boolean equals(Object ref) {
		Conta outra = (Conta) ref; //cast 
		
		if(this.agencia != outra.agencia) {
			return false;
		}
		
		if(this.numero != outra.numero) {
			return false;
		}
		return true;
	}
	
	@Override
	public int compareTo(Conta outra) {
		return Double.compare(this.saldo, outra.saldo);
	}
	
	@Override
	public String toString() {

		return " Número: " + this.numero + ", Agência: " + this.agencia + ", Saldo: " + this.saldo;
	}
}
