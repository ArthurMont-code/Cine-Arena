package Projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class Cinema {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ArrayList<Filme> filmes = new ArrayList<>();
		ArrayList<Sala> salas = new ArrayList<>();
		ArrayList<Sessao> sessoes = new ArrayList<>();
		
			Filme filme1 = new Filme ("Matrix",136,
					"Um jovem programador (Keanu Reeves) é atormentado por estranhos pesadelos nos quais sempre está conectado por cabos a um imenso sistema\n de computadores do futuro.E quando encontra os misteriosos Morpheus e Trinity, ele descobre que é vítima do Matrix, um sistema inteligente\n e artificial que manipula a mente das pessoas e cria a ilusão de um mundo real enquanto usa os cérebros e corpos dos indivíduos para produzir energia.",
					14,1999);
			Filme filme2 = new Filme("The Truman Show",103,"Pacato vendedor de seguros (Jim Carrey) tem sua vida virada de cabeça para baixo quando descobre\n que é o astro, desde que nasceu, de um show de televisão dedicado a acompanhar todos os passos de sua existência.",
					12,1998);
			Filme filme3 = new Filme("Clube da luta",139,"Um explosivo sofredor de insônia (Edward Norton) e um carismático vendedor de sabonetes (Brad Pitt) canalizam agressão primitiva masculina transformando-a\n em uma nova e chocante forma de terapia. Seu conceito pega, e formam-se diversos clubes da luta clandestinos em cada cidade, até que a sensual e excêntrica Marla\n (Helena Bonham Carter) entra na jogada\n e desencadeia uma situação fora de controle rumo ao caos.",
					18,1999);
			Filme filme4 = new Filme("Forrest Gump",142,"Quarenta anos da história dos Estados Unidos, vistos pelos olhos de rapaz com QI abaixo da média que,\n por obra do acaso, consegue participar de momentos cruciais, como a Guerra do Vietnã e Watergate.",
					14,1994);
			Filme filme5 = new Filme("Rocky",119,"Rocky Balboa, um lutador de boxe medíocre que trabalha como \"cobrador\" de um agiota, tem a chance de\n enfrentar Apollo Creed, o campeão mundial dos pesos-pesados, que \nteve a ideia de dar oportunidade a\n um desconhecido como um golpe publicitário. Mas Rocky decide treinar de modo intensivo, sonhando apenas em terminar a luta sem ter sido nocauteado pelo campeão.",
					12,1976);
			Filme filme6 = new Filme("Medo e delírio em Las Vegas",118,"Enviado para Las Vegas para cobrir o Mint 400, uma corrida de motos no deserto, \n o jornalista Dr. Thompson (Johnny Depp) e seu advogado (Benicio Del Toro) se encontram numa cidade onde\n somente drogas poderosas podem fazer com que as coisas sejam ligeiramente normais.",
					18,1998);
			filmes.add(filme1);filmes.add(filme2);filmes.add(filme3);filmes.add(filme4);filmes.add(filme5);filmes.add(filme6);
			
			Sala sala1 = new Sala(1);	Sala sala2 = new Sala(2);Sala sala3 = new Sala(3);Sala sala4 = new Sala(4);Sala sala5 = new Sala(5);Sala sala6 = new Sala(6);
			
			salas.add(sala1);
			salas.add(sala2);
			salas.add(sala3);
			salas.add(sala4);
			salas.add(sala5);
			salas.add(sala6);
			
			String [] horarios = {"13:00","16:00","19:00"};
			
			for (int x = 0;x<filmes.size();x++) {
				Filme filmeAtual = filmes.get(x);
				Sala salaAtual = salas.get(	x); // cada filme tem sua sala
			
			
			for (int y=0;y<horarios.length;y++) {
				
				Sessao novaSessao = new Sessao(filmeAtual,salaAtual, horarios[y]);
				sessoes.add(novaSessao);
			}
		
		
		
		}	Scanner leia = new Scanner(System.in);
			
			int op;
			
			do {  // INICIO DO DO WHILE, LAÇO DE LOOP

			System.out.println("\t\t=======BEM VINDO AO CINE ARENA======\n");
			System.out.println("1- Ver filmes em cartaz");
			System.out.println("2- Ver sessões por filme");
			System.out.println("3 - Comprar ingresso");
			System.out.println("0- Sair");
			op = leia.nextInt();
			leia.nextLine();
			
			
			 switch (op) {
             case 1:
            	 
            	 System.out.println("\n\t\tFilmes em cartaz:");
            	 for(Filme f : filmes) {
            		 f.exibirInfo(); // FOR IT para exibir todos os filmes com o método exibirInfo
            		 
            	 }
                 
                 break;
             case 2:
            	 
            	 System.out.println("\n\t\tFilmes em cartaz:");
            	 for(Filme f : filmes) {
            		 f.exibirInfo(); // FOR IT para exibir todos os filmes com o método exibirInfo
            		 
            	 }
            	 System.out.println("Escolha um filme para ver a sessão");
            	 String nomeFilme = leia.nextLine();	
            	 
            	 
            	 Filme filmeEncontrado = null;

            	    for (Filme f : filmes) {
            	        if (f.getTitulo().equalsIgnoreCase(nomeFilme)) {
            	            filmeEncontrado = f;
            	            break;  // Para o loop, pois já achou
            	        }
            	    }

            	    if (filmeEncontrado != null) {
            	        System.out.println("\nSessões para: " + filmeEncontrado.getTitulo());
            	        for (Sessao s : sessoes) {
            	            if (s.getFilme().equals(filmeEncontrado)) {
            	                System.out.println("- " + s.getHorario() + " na sala " + s.getSala().getNumero());
            	            } 
            	        }
            	    } else {
            	        System.out.println("Filme não encontrado.");
            	    } // VAI LISTAR AS SESSÕES ATRAVÉS DO NOME DO FILME
                 
                 break;
             case 3:
            	 
            	 char continuarCompra = 'S';
            	    while (continuarCompra == 'S') {
                 System.out.println("Filmes com sessões disponíveis");
                 
            	 for(Filme f : filmes) {
            		 f.exibirInfo(); // FOR IT para exibir todos os filmes com o método exibirInfo
            	 }
            		 
            		 //Encontrando a SESSÃO DO FILME DESEJADO
            		 //Solicita o nome do filme pro usuario
            		 System.out.println("Escolha um filme para ver a sessão e comprar o ingresso");
                	 String sessaoFilme = leia.nextLine();
                	 
                	 //PROCURA O FILME NO ARRAY
                	 Filme filmeDesejado = null;
                	 	for (Filme film : filmes) {
                	        if (film.getTitulo().equalsIgnoreCase(sessaoFilme)) {
                	            filmeDesejado = film;
                	            break;  // Para o loop, pois já achou
                	        }
                	    }

                	 	// SE O FILME FOI ENCONTRADO, MOSTRE AS SESSÕES
                	    if (filmeDesejado != null) {
                	        System.out.println("\nSessões para: " + filmeDesejado.getTitulo());
                	        
                	        for (Sessao sesh : sessoes) {
                	            if (sesh.getFilme().equals(filmeDesejado)) {
                	                System.out.println("- " + sesh.getHorario() + " na sala " + sesh.getSala().getNumero());
                	            } 
                	        }
                	        
                	        
                	        
                	         //Escolher horário da sessão
                	    
                	    System.out.println("\nDigite o horário da sesão desejada (ex: 16:00)");
                	    String horarioEscolhido = leia.nextLine();
                	        
                	        
                	        //Buscar a sessão correspondente
                	    Sessao sessaoEscolhida = null;
                	    for (Sessao s : sessoes) {
                	        if (s.getHorario().equals(horarioEscolhido) && s.getFilme().equals(filmeDesejado)) {
                	            sessaoEscolhida = s;
                	            break;
                	        }
                	    }
                	        
                	            //Exibir os assentos se encontrou a sessão
                	    
                	    if(sessaoEscolhida !=null) {
                	    	
                	    	System.out.println("\nAssentos Disponíveis");
                	    	sessaoEscolhida.exibirAssentos();
                	    	
                	    	
                	    	System.out.println("Digite a linha do assento desejado: ");
                	    	int linha = leia.nextInt();
                	    	
                	    	System.out.println("Digite a coluna do assento desejado: ");
                	    	int coluna = leia.nextInt();
                	    	
                	    	leia.nextLine();// limpa o buffer
                	    	
                	    	
                	    	if(sessaoEscolhida.getAssentos()[linha][coluna] == 'L') {
                	    		//assento livre
                	    		System.out.println("Assento disponível");

                	    		System.out.println("Qual o tipo de ingresso?");
                	    		System.out.println("1 - Inteira R$ 20,00");
                	    		System.out.println("2 - Meia-entrada R$ 10,00 (Para estudantes, funcionários do cinema e servidores público) ");

                	    			int opcao = leia.nextInt();
                	    			leia.nextLine(); // limpar buffer

                	    			String tipo = "";
                	    			double preco = 0.0;

                	    			switch (opcao) {
                	    			case 1:
                	    				tipo = "Inteiro";
                	    				preco = 20.0;
                	    				break;
                	    			case 2:
                	    				tipo = "Meia-entrada";
                	    				preco = 10.0;
                	    				break;
                	    			default:
                	    				System.out.println("Opção inválida.");
                	    				return;
                	    			}
                	    			  System.out.println("O valor do ingresso é R$" + preco);
                	    		
                	    		    System.out.println("Deseja confirmar o pagamento? (S/N)");
                	    		    
                	    		    char confirma = leia.next().toUpperCase().charAt(0);
                	    		    
                	    		    if (confirma == 'S') {
                	    		        
                	    		    	System.out.println("Processando...");
                	    		    	Thread.sleep(1000);
                	    		    	System.out.println("3...");
                	    		    	Thread.sleep(1000);
                	    		    	System.out.println("2...");
                	    		    	Thread.sleep(1000);
                	    		    	System.out.println("1...");
                	    		    	Thread.sleep(1000);
                	    		        System.out.println("Pagamento confirmado!");
                	    		        
                	    		        sessaoEscolhida.getAssentos()[linha][coluna] = 'X';  // marca como ocupado
                	    		        System.out.println("Ingresso comprado com sucesso!");
                	    		    	System.out.println("\n\nImprimindo o ingresso...");
                	    		    	Thread.sleep(1000);
                	    		    	System.out.println("3...");
                	    		    	Thread.sleep(1000);
                	    		    	System.out.println("2...");
                	    		    	Thread.sleep(1000);
                	    		    	System.out.println("1...");
                	    		    	Thread.sleep(1000);
                	    		        
                	    		        System.out.println("Ingresso impresso com sucesso!");
                	    		        
                	    		        
                	    		   
                	    		        Ingresso ingresso = new Ingresso(sessaoEscolhida, linha, coluna, tipo, preco);
                	    		        ingresso.exibirInfo();
                	    		        
                	    		        System.out.println("Deseja adicionar pipoca e refri ao seu pedido?(S/N)");
                	    		        char pedido = leia.next().toUpperCase().charAt(0);
                	    		        if( pedido == 'S') {
                	    		        	System.out.println("Deseja confirmar o pagamento(S/N)");
                	    		        	char pag = leia.next().toUpperCase().charAt(0);
                	    		        	if(pag == 'S') {
                	    		        		
                	    		        	System.out.println("Processando...");
                	    		        	
                        	    		    	Thread.sleep(1000);
                        	    		    	System.out.println("3...");
                        	    		    	Thread.sleep(1000);
                        	    		    	System.out.println("2...");
                        	    		    	Thread.sleep(1000);
                        	    		    	System.out.println("1...");
                        	    		    	Thread.sleep(1000);
                        	    		    	
                        	    		    	System.out.println("Pagamento confirmado!");
                        	    		    	
                        	    		    	System.out.println("\n\nImprimindo o ticket...");
                        	    		    	
                        	    		    	Thread.sleep(1000);
                        	    		    	System.out.println("3...");
                        	    		    	Thread.sleep(1000);
                        	    		    	System.out.println("2...");
                        	    		    	Thread.sleep(1000);
                        	    		    	System.out.println("1...");
                        	    		    	Thread.sleep(1000);
                        	    		    	
                        	    		    	System.out.println("\t\tVale combo pipoca impresso com sucesso\n");
                        	    		    	System.out.println("\t\tRetire no caixa ao lado\n\n");
                        	    		    
                	    		        	}
                	    		        	
                	    		        }
                	    		        
                	    		        else 
                	    		        {
            	    		        		System.out.println("OBRIGADO PELA COMPRA!");
            	    		       
            	    		        		
            	    		        	}
                	    		    }
                	    		   
                	    		    else 
                	    		    {
                	    		        System.out.println("Compra cancelada. Assento continua disponível.");
                	    		    }		    
                	    } 
                	    	else {
                	    		    System.out.println("Assento já está ocupado. Escolha outro.");
                	    		}
                	    		    
               	} 

                	    else
                	    {
                	    	System.out.println("Sessão não encontrada!");
                	    }
			 
                	        
  
                	    } else {
                	        System.out.println("Filme não encontrado.");
                	    } // VAI LISTAR AS SESSÕES ATRAVÉS DO NOME DO FILME
                	    leia.nextLine(); // limpa o buffer depois do último nextInt()
                	    System.out.println("Deseja comprar mais ingressos? (S/N)");
                	    String resposta = leia.nextLine().trim().toUpperCase();
                	    if (!resposta.isEmpty()) {
                	        continuarCompra = resposta.charAt(0);
                	    } else {
                	        continuarCompra = 'N'; // assume que o usuário não quer continuar se não digitou nada
                	    }
            	    }
                 break;
             case 0:
                 System.out.println("Obrigado por comprar conosco, VOLTE SEMPRE!");
                 break;
             default:
                 System.out.println("Opção inválida. Tente novamente.");
         }

     } while (op != 0);
			
			
	}

}
