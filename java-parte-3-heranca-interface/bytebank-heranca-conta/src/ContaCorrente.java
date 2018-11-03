
public class ContaCorrente extends Conta {
	// construtores não são herdados
	// chama o construtor Conta(int agencia, int numero)
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		// reaproveita o saca da classe conta e altera o valor a sacar
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
		
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}
}
