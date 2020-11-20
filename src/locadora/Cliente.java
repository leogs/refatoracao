package locadora;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
    private List<Aluguel> alugueis;

    public Cliente(String nome) {
      this.nome = nome;
      this.alugueis = new ArrayList<Aluguel>();
    }

    public void addAluguel(Aluguel aluguel) {
      this.alugueis.add(aluguel);
    }

    public String getNome() {
      return nome;
    }

	public String exibirRegistroAlugueis() {
	  double valorTotal = 0;
	  int pontos = 0;
	  
	  StringBuilder dados = new StringBuilder();
	  
	  dados.append("Registro de Aluguéis do cliente: " + getNome() + "\n");
	  for (Aluguel aluguel : this.alugueis) {
		    double valor = 0;
		
		    valor = aluguel.getValor();
	
		    pontos += aluguel.getPontos();
	
		    // Adiciona os dados desse aluguel
		    dados.append("\t" + aluguel.getFilme().getTitulo() + "\t");
		    dados.append(" = R$ " + String.valueOf(valor) + "\n");
	
		    valorTotal += valor;
	    }
	
	    // Rodapé
	    dados.append("Total gasto com aluguéis: R$ " + String.valueOf(valorTotal) + "\n");
	    dados.append("Pontos ganhos: " + String.valueOf(pontos));
	
	    return dados.toString();
	 }
}
