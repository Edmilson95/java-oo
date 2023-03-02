
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();
		System.out.println(contaDaMarcela.getSaldo());
		
		contaDaMarcela.titular = new Cliente();
		contaDaMarcela.titular.nome = "Marcela Ferreira";
		contaDaMarcela.titular.cpf = "333.333.333-33";
		contaDaMarcela.titular.profissao = "Professora";
		
				
		contaDaMarcela.deposita(500);
		System.out.println(contaDaMarcela.getSaldo());

		System.out.println(contaDaMarcela.titular.nome);
	}
}
