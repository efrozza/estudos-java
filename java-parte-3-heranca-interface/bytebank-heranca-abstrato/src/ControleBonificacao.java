
public class ControleBonificacao {

	private double soma;

	public void registra(Funcionario f1) {
		// o metodo executado abaixo sera sempre o especifico de cada tipo de funcionario
		double bonificacao = f1.getBonificacao();
		this.soma += bonificacao;
	}

	public double getSoma() {
		return soma;
	}
}
