package br.com.bytebank.banco.test;

// "Ctrl + shift + O" importa todas classes necessarias pro código
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;


///bytebank-herdado-conta/src/br/com/bytebank/banco/test/TesteContas.java
public class TesteContas {
		//java.lang.String
	public static void main(String[] args) throws SaldoInsuficienteException {
		//Full Qualified Name FQN
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(100);
		
		cc.transfere(10, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
	}

}
