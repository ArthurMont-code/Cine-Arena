package Projeto;

public class Sala implements Exibicao {
	
	private int numero;
	private int capacidade;
	
	public Sala(int numero) {
		super();
		this.numero = numero;
		this.capacidade = 30;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCapacidade() {
		return capacidade;
	}
	
	@Override
	public void exibirInfo() {
		
		System.out.println("Sala "+this.numero+ " - Capacidade "+this.capacidade+" assentos");
	}
}
