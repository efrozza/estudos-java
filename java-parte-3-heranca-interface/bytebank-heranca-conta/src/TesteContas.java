
public class TesteContas {

	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente(123, 12345);
		contaCorrente.deposita(100.0);
		
		ContaPoupanca contaPoupanca = new ContaPoupanca(111, 1111);
		contaPoupanca.deposita(200.0);

		contaCorrente.transfere(50.0, contaPoupanca);
		
		System.out.println(contaCorrente.getSaldo());
		System.out.println(contaPoupanca.getSaldo());
		
	}

}
