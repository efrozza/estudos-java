
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoEverton = new Conta();
		contaDoEverton.saldo = 100;
		
		// invoca��o de m�todo
		contaDoEverton.deposita(500);
		System.out.println(contaDoEverton.saldo);
		
		if  (contaDoEverton.saca(100)) {
			System.out.println("Saque efetuado com sucesso");
			System.out.println("Saldo atualizado " + contaDoEverton.saldo);
		} else {
			System.out.println("N�o foi poss�vel efetuar o saque");
		}
		
		Conta contaDoJoao = new Conta();
		contaDoJoao.deposita(1000);
		
		if  (contaDoJoao.transfere(300, contaDoEverton)) {
			System.out.println("Transfere efetuado com sucesso");
		}
		
		System.out.println(contaDoEverton.saldo);
		System.out.println(contaDoJoao.saldo);
	}
}
