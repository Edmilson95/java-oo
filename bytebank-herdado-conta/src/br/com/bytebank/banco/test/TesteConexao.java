package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conexao;

public class TesteConexao {
	public static void main(String[] args) {

		try (Conexao conexao = new Conexao()) {
			conexao.LeDados();
		} catch(IllegalStateException ex) {
			System.out.println("Deu erro na conexão");
		}

		// -----------------------------------------------------
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.LeDados();
//		} catch (IllegalStateException ex) {
//			System.out.println("Deu erro na conexão");
//		} finally {
//			System.out.println("finally");
//			if (con != null) {
//				con.close();
//			}
//		}
//
//	}
		
	}
}
