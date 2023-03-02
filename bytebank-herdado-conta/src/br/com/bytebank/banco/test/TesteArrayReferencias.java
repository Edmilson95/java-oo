package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.Conta;

public class TesteArrayReferencias {
	public static void main(String[] args) {
		
		//int[] idades = new idades[5];
		Object[] referencias = new Object[5];
		
		ContaCorrente conta1 = new ContaCorrente(22, 11);
		referencias[0] = conta1;
		
		ContaPoupanca conta2 = new ContaPoupanca(22, 12);
		referencias[1] = conta2;
		
//		Object referenciaGenerica = contas[1];
//		System.out.println(contas[1].getNumero());
		
		ContaPoupanca ref = (ContaPoupanca) referencias[1]; // type cast (obriga e diz ao compilador "tenho ctza que esta apontado para ref correta, roda essa porra de codigo")
		System.out.println(conta2.getNumero());
		System.out.println(ref.getNumero());
	}
}
