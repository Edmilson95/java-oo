
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoEd = new Conta();
		contaDoEd.saldo = 100;
		contaDoEd.deposita(50);
		System.out.println(contaDoEd.saldo);

		boolean conseguiuRetirar = contaDoEd.saca(20);
		System.out.println(contaDoEd.saldo);
		System.out.println(conseguiuRetirar);

		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		System.out.println(contaDaMarcela.saldo);
		
		boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDoEd);
		if(sucessoTransferencia) {
			System.out.println("Transferencia realizada com sucesso. ");
		} else {
			System.out.println("Transferencia não realizada. ");
		}
		
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoEd.saldo);

		contaDoEd.titular = "Edmilson Ferreira";
		System.out.println(contaDoEd.titular);
	}
}
