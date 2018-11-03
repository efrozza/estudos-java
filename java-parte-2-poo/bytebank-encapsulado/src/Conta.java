
public class Conta {
	// atributo private soh pode ser modificado dentro da classe
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;

	// rotina de inicializa��o. Diferenciando-se de metodos por n�o ter retorno e s�
	// executa quando � feito new Conta()
	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("Total de contas " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criando uma conta " + this.numero);
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;

	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		}
		return false;

	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int novoNumero) {
		if (novoNumero <= 0) {
			System.out.println("N�o pode valor menor igual a zero");
			return;
		}
		this.numero = novoNumero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("N�o pode valor menor ou igual a zero");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}
