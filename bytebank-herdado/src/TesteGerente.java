
public class TesteGerente {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Numano de Souza");
		g1.setCpf("122.345.212-90");
		g1.setSalario(8902.00);
		g1.setSenha(1222);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		System.out.println(g1.getBonificacao());
		
		g1.setSenha(1222);
		boolean autenticou = g1.autentica(1222);
		
		System.out.println(autenticou);
		
	}
}
