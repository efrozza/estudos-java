
public class ControleBonificacaoErrado {

	private double soma;

	// o erro dessa classe � percebido logo abaixo, 3 metodos que fazem exatamente a
	// mesma coisa
	// alterando apenas o tipo de cliente

	public void registra(Gerente g1) {
		double bonificacao = g1.getBonificacao();
		this.soma += bonificacao;
	}

	public void registra(Funcionario f1) {
		double bonificacao = f1.getBonificacao();
		this.soma += bonificacao;
	}

	public void registra(EditorVideo e1) {
		double bonificacao = e1.getBonificacao();
		this.soma += bonificacao;
	}

	public double getSoma() {
		return soma;
	}
}
