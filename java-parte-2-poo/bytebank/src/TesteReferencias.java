
public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300.0;
				
		Conta segundaConta = primeiraConta;
		
		primeiraConta.saldo += 100;
		
		System.out.println("salda da segunda conta " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		
		System.out.println("salda da primeira conta " + primeiraConta.saldo);
		System.out.println("salda da segunda conta " + segundaConta.saldo);
		
		// existe apenas um newConta então apenas uma endereço de memoria é criado
		
		if  (primeiraConta == segundaConta) {
			System.out.println("São a mesma conta");
			System.out.println(primeiraConta);
			System.out.println(segundaConta);
		}
		
	}
}
