package Projeto;

public class Filme implements Exibicao{
	
	private String titulo;
	private int duracao; // MINUTOS
	private String sinopse;
	private int classificacao;
	private int anoLancamento;
	
	public Filme(String titulo, int duracao, String sinopse, int classificacao, int anoLancamento) {
		super();
		this.titulo = titulo;
		this.duracao = duracao;
		this.sinopse = sinopse;
		this.classificacao = classificacao;
		this.anoLancamento = anoLancamento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public int getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	
	@Override
	
	public void exibirInfo() {
		
		System.out.println("|--------------------|");
		System.out.println("\n|       FILME-----|");
		System.out.println("|--------------------|");
		System.out.println("|Título: "+this.titulo+"|");
		System.out.println("|Duração: "+this.duracao+" minutes |");
		System.out.println("|Ano de lançamento: "+this.anoLancamento+"|");
		System.out.println("|Sinopse: "+this.sinopse+"|");
		System.out.println("|Classificação Indicativa: + "+this.classificacao+"|");
		System.out.println("|--------------------|");
		
		
	}
	
	

	

}
