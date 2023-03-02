package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {
	public static void main(String[] args) {
		
		Integer idadeRef = Integer.valueOf(29); //autobixing é criado um objeto do tipo Integer
		System.out.println(idadeRef.intValue());//unboxing transforma em int primitivo
		
		Double dRef = Double.valueOf(3.2); //autoboxing
		System.out.println(dRef.doubleValue()); //unboxing
		
		Boolean bRef = Boolean.TRUE;
		System.out.println(bRef.booleanValue()); //transforma em primitivo
		
		Number refNumero = Float.valueOf(29.2f);
		
		
		List<Number> lista = new ArrayList<>();
		lista.add(29);
		lista.add(21.6);
		lista.add(25.5f);
	}
}
