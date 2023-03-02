
public class TesteSistema {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setSenha(2222);
		
		Autenticavel adm = new Administrador();
		adm.setSenha(2222);
		
		Autenticavel cliente = new Cliente();
		cliente.setSenha(2222);
		
		SistemaInterno sistema = new SistemaInterno();
		sistema.autentica(gerente);
		sistema.autentica(adm);
		sistema.autentica(cliente);

	}

}
