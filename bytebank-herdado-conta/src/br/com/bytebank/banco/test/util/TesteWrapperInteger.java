package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
	public static void main(String[] args) {

		int idade = 29; // Integer
		Integer idadeRef = Integer.valueOf(29);// autoboxing
		System.out.println(idadeRef.doubleValue());

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);

		int valor = idadeRef.intValue();// unboxing
		String s = args[0];// "10"
		// Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);
		System.out.println(numero);

		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29); // Autoboxing

		// autoboxing transforma um tipo primitivo em um Integer(objeto),
		// unboxing transforma um Integer(objeto) em um tipo primitivo
		// int -> Integer
		// double -> Double.... e etc etc

		Integer iParseado1 = Integer.valueOf("42"); // parseando e devolvendo referencia
		int iParseado2 = Integer.parseInt("44"); // parseando e devolvendo primitivo

		System.out.println(iParseado1); // 42
		System.out.println(iParseado2); // 44
	}
}
