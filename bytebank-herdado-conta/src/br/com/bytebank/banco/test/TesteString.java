package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {

		String nome = "Alura";//object literal
	//	String nome = new String("Alura");
		
		
		String vazio = " Santos    ";
		String outroVazio = vazio.trim();//tira os espaços antes durante e dps da string
		
		System.out.println(vazio.contains("San"));
		System.out.println(outroVazio.isEmpty());
		
		
		
		System.out.println(nome.length());//quantidade de caracteres
		
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
//		String sub = nome.substring(1);
//		System.out.println(sub);
		
//		String outro = nome.replace("a", "AA");//com aspas simples representar um 'char'	
//			nome.toLowerCase();
		
//		int posicao = nome.indexOf("ura");
//		System.out.println(posicao);
//		
//		char c = nome.charAt(2);//descobrir qual a posicao do char que vc mandou pelo index(começa pelo 0)
//		System.out.println(c);
//				
		System.out.println(nome);

		
	}

}
