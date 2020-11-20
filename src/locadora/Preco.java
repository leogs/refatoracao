package locadora;

public abstract class Preco {
	int preco;
	
	public int getPreco() {
		return preco;
	}
	
	public int getPontos(int diasAluguel) {
		return 1;
	}
	
	public abstract double getValor(int diasAluguel);

}
