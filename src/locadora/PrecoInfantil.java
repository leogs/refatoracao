package locadora;

public class PrecoInfantil extends Preco {

	@Override
	public int getPreco() {
		return Filme.INFANTIL;
	}
	
	@Override
	public double getValor(int diasAluguel) {
		double valor = 2;
		
	    if (diasAluguel > 2)
	    	valor += (diasAluguel - 2) * 1.5;
	    
	    return valor;
	}
}
