package Projeto;

public class Sessao implements Exibicao{

	private Filme filme;
	private Sala sala;
	private String horario;
	private char[][] assentos;
	
	public Sessao(Filme filme, Sala sala, String horario) {
		super();
		this.filme = filme;
		this.sala = sala;
		this.horario = horario;
		this.assentos = new char [5][6]; // Matrix dos 30 assentos
		assentosLivres();
		
	}
		private void assentosLivres() {
			
			for(int l=0; l < assentos.length; l++) {
				for(int c = 0; c < assentos[l].length; c++) {
					assentos[l][c] = 'L';
				
			}
		}
		
	}
		public void exibirAssentos() {
		    System.out.println("\nMapa de assentos da sessão das " + horario + " - Sala " + sala.getNumero());

		    // Cabeçalho com as colunas (0, 1, 2...)
		    System.out.print("  "); // Espaço inicial para alinhar com os números das linhas
		    for (int c = 0; c < assentos[0].length; c++) {
		        System.out.printf(" %d ", c); //para ter dois esoaços entre os numeros inteiros
		    }
		    System.out.println();

		    // ASSENTOS EXIBIDOS EM MATRIZ
		    for (int l = 0; l < assentos.length; l++) {
		        System.out.printf("%d ", l); // TEXTO DE LINHA AO INICIO DA LINHA PARA MOSTRAR UM NUMERO 
		        for (int c = 0; c < assentos[l].length; c++) {
		            System.out.print("[" + assentos[l][c] + "]");
		        }
		        System.out.println(); // Quebra de linha
		    }
		}


	public Filme getFilme() {
		return filme;
	}

	public Sala getSala() {
		return sala;
	}

	public String getHorario() {
		return horario;
	}	
	public char[][] getAssentos() {
        return assentos;
    }
	
	@Override
	public void exibirInfo() {
		
		System.out.println("Sessão - Filme "+ filme.getTitulo()+
				"| Horário: "+ horario +
				"| Sala: "+ sala.getNumero());
	}
}
