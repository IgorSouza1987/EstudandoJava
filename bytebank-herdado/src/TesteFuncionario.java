
public class TesteFuncionario {

	public static void main(String[] args) {

		Gerente nico = new Gerente();
		
		nico.setNome("Jose Henrique");
		nico.setCpf("122.234.332-90");
		nico.setSalario(2000.0);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
		
		System.out.println(nico.getNome());
		System.out.println(nico.getSalario());
	}

}
