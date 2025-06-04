package Projeto;



public class Ingresso implements Exibicao{
	
	private Sessao sessao;
	private int linha;
	private int coluna;
	private String tipo; //inteiro, meia, cortesia kids
	private double preco;
	
	public Ingresso(Sessao sessao, int linha, int coluna, String tipo, double preco) {
		super();
		this.sessao = sessao;
		this.linha = linha;
		this.coluna = coluna;
		this.tipo = tipo;
		this.preco = preco;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Sessao getSessao() {
		return sessao;
	}

	public int getLinha() {
		return linha;
	}

	public int getColuna() {
		return coluna;
	}

	public double getPreco() {
		return preco;
	}
	
	@Override
	public void exibirInfo() { 
		System.out.println("|--------------------|");
		System.out.println("\n|----INGRESSO------|");
		System.out.println("|--------------------|");
		System.out.println("|Ingresso: "+ this.tipo);
		System.out.println("|Sala: "+ sessao.getSala().getNumero());
		System.out.println("|Assento: "+linha+"-"+coluna);
		System.out.println("|Preço: R$ "+ this.preco);
		System.out.println("|Filme: "+ sessao.getFilme().getTitulo());
		System.out.println("|Horário: "+ sessao.getHorario());
		System.out.println("|--------------------|");
		
	}
	
	

}
