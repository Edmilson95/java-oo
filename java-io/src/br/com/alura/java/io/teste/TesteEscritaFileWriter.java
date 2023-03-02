package br.com.alura.java.io.teste;


import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {

		//Fluxo de entrada com um arquivo
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		
		bw.write("Louco e sonhador loucos e sonhadoooorrrrr iiiiiiiiiiiiha");
		bw.newLine();
		bw.write("eita caraiooo ajahahahaha elelelelemsdjdjdjd");
		bw.newLine();
		bw.write(System.lineSeparator());//system.lineseparator é um metodo do filewriter, enquanto o new line é do bufferedWriter
		bw.write("deu certo family");
		
		
		bw.close();
		
	}

}
