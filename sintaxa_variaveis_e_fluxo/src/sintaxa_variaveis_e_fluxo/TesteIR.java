package sintaxa_variaveis_e_fluxo;

//De 1900.0 até 2800.0, o IR é de 7.5% e pode deduzir na declaração o valor de R$ 142
//De 2800.01 até 3751.0, o IR é de 15% e pode deduzir R$ 350
//De 3751.01 até 4664.00, o IR é de 22.5% e pode deduzir R$ 636

public class TesteIR {
	public static void main(String[] args) {
		double salario = 3500.0;

		if (salario >= 1900 && salario <= 2800) {
			System.out.println("A sua aliquota é de 7.5%. ");
			System.out.println("Voce pode deduzir até R$ 142.00");
		} else if (salario >= 2801 && salario <= 3751) {
			System.out.println("A sua aliquota é de 15%. ");
			System.out.println("Voce pode deduzir ate R$ 350.00");
		} else if (salario >= 3751.01 && salario <= 4664) {
			System.out.println("Sua aliquota é de 22.5%. ");
			System.out.println("Voce pode deduzir ate R$ 636.00");
		}
	}
}