
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(100, 1234);

		//System.out.println(conta.getNumero());
		conta.setAgencia(2838);
		
		Conta conta2 = new Conta(101, 4321);
		Conta conta3 = new Conta(102, 3241);
		System.out.println("total de contas é " + Conta.getTotal());
		
		conta.transfere(100, conta2);
	}
}
