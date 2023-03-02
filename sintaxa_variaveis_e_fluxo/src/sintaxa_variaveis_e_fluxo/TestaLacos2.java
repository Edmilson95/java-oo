package sintaxa_variaveis_e_fluxo;

public class TestaLacos2 {
	public static void main(String[] args) {
		// for (int linha = 0; linha < 10; linha++ ) {
		// for (int coluna = 0; coluna < linha; coluna++) {
		// if (coluna > linha)
		// break;
		// System.out.print("*");
		// }
		// System.out.println();
//*---------------------------------------------------------------*
		// for (int linha = 0; linha < 5; linha++) {
		// for (int coluna = 0; coluna < 5; coluna++) {
		// if (coluna > linha ) {
		// break;
		// }
		// System.out.print(coluna + 1);
		// }
		// System.out.println();
		// }
//*----------------------------------------------------------------*
		
		//for (int multiplo = 0; multiplo < 100; multiplo+= 3) {
		//	System.out.println(multiplo);
		//}
		//
		//for (int multiplo = 0; multiplo <= 100; multiplo++) {
		//	if (multiplo % 3 == 0)
		//		System.out.println(multiplo);
		//}
		
		int fatorial = 1;
		for (int i = 1; i < 11; i++) {
			fatorial *= i;
			System.out.println("Fatorial de " + i + " = " + fatorial);
		}
	}
}
