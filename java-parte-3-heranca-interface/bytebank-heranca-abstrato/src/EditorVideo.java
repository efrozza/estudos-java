// Gerente � um funcionario (extends) herda da classe Funcionario
public class EditorVideo extends Funcionario {

	// sobrescrita de metodo.
	public double getBonificacao() {
		// usamos this quando o atributo esta na propria classe return this.salario;
		// usando super sabemos que o atributo vem da classe mae	
		return 150;
	
	}

}
