
public class TestaBanco {
	public static void main(String[] args) {
		Cliente everton = new Cliente();
		everton.nome = "Everton Frozza";
		everton.cpf = "12333333";
		everton.profissao = "Analista de sistemas";
		
		Endereco enderecoCliente = new Endereco();
		enderecoCliente.cidade = "Pato Branco";
		
		//o endereco � o enderecoCliente do tipo Endereco
		everton.endereco = enderecoCliente;
		
		Conta contaEverton = new Conta();
		contaEverton.agencia = 123;
		contaEverton.numero = 1234;
		
		// o titular o � do tipo Cliente instancionado como everton
		contaEverton.titular = everton;
		
		System.out.println(contaEverton.titular.nome);
		System.out.println(contaEverton.titular.endereco.cidade);
				
	}
}
