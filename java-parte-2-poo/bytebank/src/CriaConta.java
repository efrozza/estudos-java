
public class CriaConta {

	public static void main(String[] args) {
		// new Conta cria a referencia de memoria para uma Conta
		// Conta primeiraConta é uma referencia a uma Conta
		Conta primeiraConta = new Conta();
		primeiraConta.agencia = 123;
		primeiraConta.numero = 456;
		primeiraConta.titular = "Everton";
		primeiraConta.saldo = 200.0;

		primeiraConta.saldo += 100;
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50.0;

		System.out.println("Saldo da primeira conta " + primeiraConta.saldo);
		System.out.println("Saldo da segund aconta " + segundaConta.saldo);

	}
}
