
public class ContaPoupanca extends Conta {
	public ContaPoupanca(int agencia, int numero) {
		// construtores n�o s�o herdados
		// chama o construtor Conta(int agencia, int numero)
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}
}
