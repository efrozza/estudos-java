// Gerente � um funcionario (extends) herda da classe Funcionario
public class Gerente extends Funcionario implements Autenticavel {

	// composicao
	private AutenticacaoUtil autenticacaoUtil;
	
	public Gerente() {
		this.autenticacaoUtil = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticacaoUtil.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticacaoUtil.autentica(senha);
	}
	
	// sobrescrita de metodo.
	public double getBonificacao() {
		// usamos this quando o atributo esta na propria classe return this.salario;
		// usando super sabemos que o atributo vem da classe mae
		System.out.println("Bonificacao de gerente");
		return super.getSalario();
	}

}
