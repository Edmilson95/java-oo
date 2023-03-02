
public class TesteReferencias {
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
		
//		Funcionario f = new Funcionario();
//		f.setSalario(2000.0);
		
		EditorVideo editor = new EditorVideo();
		editor.setSalario(3000.0);
		
		Designer designer = new Designer();
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
//		controle.registra(f);
		controle.registra(editor);
		controle.registra(designer);
		
		System.out.println(controle.getSoma());
		
		
	}
}
