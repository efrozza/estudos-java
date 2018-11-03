// Gerente � um funcionario (extends) herda da classe Funcionario
public class Gerente extends Funcionario {

	private int senha;

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	//novo m�todo, recebendo dois params
    public boolean autentica(String login, int senha) {
        //implementacao omitida
    	return false;
    }	
	
	
	public void setSenha(int senha) {
		this.senha = senha;
	}

	// sobrescrita  de metodo. 
	public double getBonificacao() {
		// usamos this quando o atributo esta na propria classe return this.salario;
		// usando super sabemos que o atributo vem da classe mae
		System.out.println("Bonificacao de gerente");
		return super.getBonificacao() + super.getSalario();
	}

}
