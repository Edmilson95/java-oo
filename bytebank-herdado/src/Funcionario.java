
// abstract não pode instanciar(criar) objeto dessa classe
public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario; //protected significa "publica para meus filhos, privado para outras classes"
	
 // metodo abstract não tem corpo, não tem implementacao na classe mãe, só nos filhos
	public abstract double getBonificacao();
	
	// GETTER SÓ RETORNA , SETTER ALTERA
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return this.salario;
	}
	public void setSalario (double salario) {
		this.salario = salario;
	}
	
	
}
