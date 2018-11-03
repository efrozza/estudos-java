
public class FuncionarioTeste {
	
	// classe que explifica o problema de n�o usar heran�a e ou usar paradigma procedural
	
	private String nome;
	private String cpf;
	private double salario;
	private int senha;

	// ideia procedural comparar depois com a classe Funcionario usando heran�a

	private int tipo = 0; // 0 - funcionario, 1 - gerente, 2 - diretor
	
	// nesse metodo temos o problema dele servir para todos os tipos de funcionraios
	public boolean autentica (int senha) {
		if  (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	public double getBonificacao() {

		// 0 - funcionario
		if (this.tipo == 0) {
			return this.salario * 0.1;
		} else if (this.tipo == 1) {
			// 1 - gerente
			return this.salario;
		} else {
			// 2 - diretor
			return this.salario + 1000.0;
		}

	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getTipo() {
		return tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
