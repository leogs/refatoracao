package locadora;

public class Principal {
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente("Pedro");
		Filme filmeA = new Filme("Titanic", 0);
		Filme filmeB = new Filme("Frozen", 1);
		
		Aluguel aluguelA = new Aluguel(filmeA, 4);
		Aluguel aluguelB = new Aluguel(filmeB, 5);
		
		cliente.addAluguel(aluguelA);
		cliente.addAluguel(aluguelB);
		
		System.out.println(cliente.exibirRegistroAlugueis());
	}

}
