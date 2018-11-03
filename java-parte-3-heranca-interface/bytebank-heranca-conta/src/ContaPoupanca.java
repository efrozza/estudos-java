
public class ContaPoupanca extends Conta {
	public ContaPoupanca(int agencia, int numero) {
		// construtores não são herdados
		// chama o construtor Conta(int agencia, int numero)
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}
}
