
public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Paulo Silveira");
		g1.setSalario(1220.0);
		
		EditorVideo ev = new EditorVideo();
		ev.setNome("Jose Henrique");
		ev.setSalario(1000.0);
		
		ControleBonificacao con = new ControleBonificacao();
		con.registra(g1);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getSalario());
		System.out.println(g1.getBonificacao());
		
		System.out.println();
		
		System.out.println();
		
		System.out.println(ev.getNome());
		System.out.println(ev.getSalario());
		System.out.println(ev.getBonificacao());
	}
}
