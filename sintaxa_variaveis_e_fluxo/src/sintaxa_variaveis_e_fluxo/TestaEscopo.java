package sintaxa_variaveis_e_fluxo;

public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		
		int idade = 17;
		int quantidadePessoas = 1;
		
		//boolean acompanhado = quantidadePessoas >= 2;
		boolean acompanhado;
		
		if (quantidadePessoas >= 2) {
			 acompanhado = true;
		} else {
			 acompanhado = false;
		}
		
		System.out.println("valor de acompanhado = " + acompanhado);
		
		if (idade >= 18 || acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
				System.out.println("Infelizmente voce nao pode entrar");
			}
		}
}
