package restaurante;

import java.util.Scanner;

public class Principal {
	
	public static char menu() {
		String dados;
		
		System.out.println("-------------------------------");
		System.out.println("- Escolha uma opção           -");
		System.out.println("-------------------------------");
		System.out.println("- 1. Cadastrar o pedido       -");
		System.out.println("- 2. Mostrar todos os pedidos -");
		System.out.println("- 3. Encontrar um pedido      -");
		System.out.println("- 4. Cancelar o pedido        -");
		System.out.println("- 5. Sair do Programa         -");
		System.out.println("-------------------------------");
		
		dados = new Scanner (System.in).next();
		// Retorna o primeiro caracter que for digitado
		return dados.charAt(0);
	}

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner (System.in);
		
		char opcao;
		ListaSimples lista = new ListaSimples ();
		Restaurante cliente;
		
		do {
			opcao = menu();
			
			switch (opcao) {
			
				case '1':
					System.out.println("------- Inserindo no início -------");
					cliente = new Restaurante ();
					
					System.out.println("Número do pedido: ");
					cliente.setPedido(leitura.next());
					
					System.out.print("Valor total: R$");
					cliente.setQuantia(leitura.nextInt());
					
					lista.incluirPrim(cliente);
					break;
				
				case '2':
					System.out.println("---------------------");
					System.out.println("Pedidos: \n" + lista.mostrarLista());
					System.out.println("---------------------");
					break;
				
				case '3':
					if (lista.listaVazia()) {
						System.out.println("A lista está vazia!");
						
					} else {
						System.out.print("Localizando pedido... \nDigite o pedido:");
						String pedido = leitura.next();
						
						if (lista.procurarNodo(pedido) == null) {
							System.out.println("O pedido procurado não está na lista!");
							
						} else {
							System.out.println(" Pedido encontrado! ");
							System.out.println(lista.procurarNodo(pedido));
							System.out.println("--------------------");
						}
					}
					break;
					
				case '4':
					if (lista.listaVazia()) {
						System.out.println("A lista está vazia!");
						
					} else {
						System.out.println("Excluir um pedido... \nDigite o número: ");
						String pedido = leitura.next();
						
						if (lista.removNodo(pedido)) {
							System.out.println(pedido + " foi removido com sucesso!");
							
						} else {
							System.out.println("Não foi possível remover " + pedido);
						}
					}
					break;
					
				case '5':
					System.out.println("Fim do programa!!");
					break;
				
				default:
					System.out.println("Opção inválida, tente novamente!");
			}
			
		} while (opcao != '5');
		System.exit(0);

	}

}
