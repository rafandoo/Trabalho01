package restaurante;

public class filaCaixa {
	
	// Declara��o dos atributos
	private int[] valores;
	private int primeiro;
	private int ultimo;
	private int total;
	
	
	// Declara��o do construtor
	public filaCaixa () {
		valores = new int[10];
		primeiro = 0;
		ultimo = 0;
		total = 0;
	}
	
	
	public void inserir (int elemento) {
		
		if (isFull()) {
			throw new RuntimeException("Fila Cheia! N�o d� para inserir mais ningu�m!");
		}
		
		valores [ultimo] = elemento;
		ultimo = (ultimo + 1) % valores.length;
		total++;
	}
	
	
	public int retirar () {
		
		if (isEmpty()) {
			throw new RuntimeException("Fila Vazia! Ningu�m para ser retirado!");
		}
		
		int elemento = valores [primeiro];
		primeiro = (primeiro + 1) % valores.length;
		total--;
		return elemento;
	}
	
	
	// Se o total for igual a zero retorna true
	// Se for diferente de zero, retorna false
	public boolean isEmpty () {
		return total == 0;
	}
	
	
	// Busca o tamanho do vetor
	public boolean isFull () {
		return total == valores.length;
	}
}
