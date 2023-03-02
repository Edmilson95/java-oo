// Gerente é um funcionario // gerente herda da class funcionario

public class EditorVideo extends Funcionario {

	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do EDITOR DE VIDEO");
		return  150; // super = busca os metodos da classe mãe
	}

}
