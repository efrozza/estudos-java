
public class TestaGeteSet {
	public static void main(String[] args) {
		Conta conta = new Conta(1,1);
		conta.setNumero(123);
		System.out.println(conta.getNumero());
		
		Cliente everton = new Cliente();
		everton.setNome("Everton");
		
		conta.setTitular(everton);
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		//agora em duas linhas
		
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setNome("everton frozza");
		System.out.println(conta.getTitular().getNome());
		
		//como temos apenas um new cliente ocorre a altera��o e o get do mesmo endere�o de mem�ria
		
		System.out.println(titularDaConta);
		System.out.println(conta.getTitular());
		System.out.println(everton);
		
		
	}
}
