package br.com.alura;

import java.util.List;

public class TestaCurso {
	
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando Colecoes com JAVA" , "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		System.out.println(javaColecoes.getAulas());

	}
}

class TestaCursoExercicio{
	
	public static void main(String[] args) {
		Curso exercicioJava = new Curso("Criando um curso", "Edmilson");

		List<Aula> aulas = exercicioJava.getAulas();
		System.out.println(aulas);
		
		exercicioJava.adiciona(new Aula("Curso Alura", 15));
		System.out.println(aulas);
		System.out.println("----------------");
		System.out.println(aulas);
	}
}
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;

//class TesteListas {
//
//    public static void main(String[] args) {
//
//        System.out.println("**** ArrayList vs LinkedList ***");
//
//        List<Integer> numerosArrayList = new ArrayList<>();
//        List<Integer> numerosLinkedList = new LinkedList<>();
//        int quantidadeElementos = 1000000;
//
//        long tempoArrayList  = insereElementosNo(numerosArrayList, quantidadeElementos);
//        long tempoLinkedList = insereElementosNo(numerosLinkedList, quantidadeElementos);
//
//        System.out.println("Inserção na ArrayList demorou  " + tempoArrayList);
//        System.out.println("Inserção na LinkedList demorou " + tempoLinkedList);
//
//        tempoArrayList = removePrimeirosElementos(numerosArrayList);
//        tempoLinkedList = removePrimeirosElementos(numerosLinkedList);
//
//        System.out.println("Remoção da ArrayList demorou  " + tempoArrayList);
//        System.out.println("Remoção da LinkedList demorou " + tempoLinkedList);
//    }
//
//    /*
//     * removendo 100 elementos sempre na primeira posição
//     */
//    private static long removePrimeirosElementos(List<Integer> numeros) {
//        long ini = System.currentTimeMillis();
//
//        for (int i = 0; i < 100; i++) {
//            numeros.remove(0); //removendo sempre o primeiro elemento
//        }
//        long fim = System.currentTimeMillis();
//        return fim-ini;
//    }
//
//    private static long insereElementosNo(List<Integer> numeros, int quantidade) {
//        long ini = System.currentTimeMillis();
//        for (int i = 0; i < quantidade; i++) {
//            numeros.add(i);
//        }
//        long fim = System.currentTimeMillis();
//        return fim-ini;
//    }


