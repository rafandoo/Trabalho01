package restaurante;

public class AplicacaoFilaCaixa {
	
	public static void main (String args[]) {
		
		filaCaixa fila = new filaCaixa();
		
		fila.inserir(1);
		fila.inserir(2);
		fila.inserir(3);
		fila.inserir(4);
		
		
		while (!fila.isEmpty()) {
			
			int x = fila.retirar();
		}
		
	}
}
