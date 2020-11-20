package locadora;

public class Aluguel {
	  private Filme filme;
	  private int diasAluguel;

	  public Aluguel(Filme filme, int diasAluguel) {
	    this.filme = filme;
	    this.diasAluguel = diasAluguel;
	  }

	  public Filme getFilme() {
	    return filme;
	  }

	  public int getDiasAluguel() {
	    return diasAluguel;
	  }

		public double getValor() {
			return filme.getValor(this.getDiasAluguel());
		}

		public int getPontos() {
			return filme.getPontos(this.getDiasAluguel());
		}
	}
