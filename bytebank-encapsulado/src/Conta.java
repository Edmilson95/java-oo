
public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	//Construtor
	public Conta (int agencia, int numero) {
		Conta.total++;
		System.out.println("O total de contas é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Conta: " + this.numero +
				" Agencia: " + this.agencia);
	}
	
	//Métodos
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca (double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (saca(valor)) {
			destino.deposita(valor);
			return true;
		} else {
			System.out.println("saldo insuficiente. ");
			return false;
		}
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
	
	public void setTiTular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}
