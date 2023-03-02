package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		
		//Generics (é pra guardar só um item tipo especifico dentro de um ArrayList, por ex só Conta.
		List<Conta> lista = new ArrayList<Conta>();
		//Generic existe para nao misturar os tipos de referencias na lista do array
		
		Conta cc = new ContaCorrente(10, 20);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(10, 22);	
		lista.add(cc2);
		
		System.out.println("Tamanho: " + lista.size()); // size() mostra quantidade de elementos dentro do array
		
		Conta ref = lista.get(0);	
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta cc3 = new ContaCorrente(10, 23);
		lista.add(cc3);
		Conta cc4 = new ContaCorrente(10, 24);
		lista.add(cc4);
		
		for (int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		System.out.println("-----------");
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}
		
	}

}
