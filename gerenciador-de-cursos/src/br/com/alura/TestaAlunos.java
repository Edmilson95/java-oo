package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {
	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		alunos.add("Nico Steppat"); //o metodo nao adc itens repetidos
		
		Boolean adicinou = alunos.add("Nico Steppat");
		System.out.println("adc o nico dnv? " + adicinou);
		
		System.out.println(alunos);
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		System.out.println("----------------");
		
		alunos.forEach(aluno -> System.out.println(aluno));
		
		Boolean estaMatriculado = alunos.contains("Edmilson");
		System.out.println(estaMatriculado);
		
		int tamanhoConjunto = alunos.size();
		System.out.println("O tamanho do conjunto Set é " + tamanhoConjunto);
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
		
		Collections.sort(alunosEmLista);
		
		System.out.println(alunosEmLista);
		
		for (String aluno : alunosEmLista) {
			System.out.println(aluno);
		}
	}
}
