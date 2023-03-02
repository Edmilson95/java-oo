package br.com.alura.java.io.teste;


import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrintScreamPrintWriter {

	public static void main(String[] args) throws IOException {

		//Fluxo de entrada com um arquivo
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
//		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		
//		PrintStream ps = new PrintStream(new File("lorem2.txt"));
		
		PrintWriter ps = new PrintWriter("lorem.txt", "UTF-8");
		
		ps.println("Louco louco louco e sonhador loucos e sonhadoooorrrrr iiiiiiiiiiiiha");
		ps.println();
		ps.println("eita caraiooo kakakaakaak ajahahahaha elelelelemsdjdjdjd");
		ps.println("deu certo family");
		
		
		ps.close();
		
	}

}
