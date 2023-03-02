package br.com.alura;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando Colecoes com JAVA", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		Aluno a1 = new Aluno("Rodrigo Turini", 2423);
		Aluno a2 = new Aluno("Guilherme Silveira", 8372);
		Aluno a3 = new Aluno("Mauricio Aniche", 2738);
		Set<Aluno> alunos = new HashSet<>();
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os alunos matriculados neste curso: ");
		javaColecoes.getAlunos().forEach(aluno -> {
			System.out.println(aluno);
		});
		System.out.println("O aluno " + a1 + " esta matriculado? " + javaColecoes.estaMatriculado(a1));
		
		Aluno turini = new Aluno("Rodrigo Turini", 2423);
		System.out.println("Esse turini ta matriculado? " + javaColecoes.estaMatriculado(turini));
		System.out.println("turini a1 e turini são iguais? " + a1.equals(turini));
		
		
		System.out.println(a1.hashCode() == turini.hashCode());
		
		
		
		
		
		Set<String> nomes = Collections.emptySet(); // devolve um set vazio que nada pode ser adicionado
		//nomes.add("Paulo");
		
		Set<Aluno> alunosSincronizados = Collections.synchronizedSet(alunos);
		System.out.println("imprime isso aqui: " + alunosSincronizados);
		
		
		// jeito antigo de fazer um laço foreach
		Set<Aluno> alunos2 = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos2.iterator();
		while(iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}
	}
}