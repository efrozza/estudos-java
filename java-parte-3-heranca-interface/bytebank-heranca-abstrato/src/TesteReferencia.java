
public class TesteReferencia {
	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setSalario(5000.0);

		EditorVideo e1 = new EditorVideo();
		e1.setSalario(1000);
		
		Designer d1 = new Designer();
		d1.setSalario(4000);
		
		ControleBonificacao controleBonificacao = new ControleBonificacao();
		controleBonificacao.registra(g1);
		
		controleBonificacao.registra(e1);
		controleBonificacao.registra(d1);

		System.out.println(controleBonificacao.getSoma());

	}
}
