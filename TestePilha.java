package algoritmos;

public class TestePilha {
	public static void main(String[] args) {
		Pilha pilha = new Pilha() {
			pilha.empilhar(10);
			pilha.empilhar(6);
			pilha.empilhar(7);
			pilha.empilhar(1);
			
			pilha.imprimir();
			
			System.out.println(pilha.desempilhar());
			
			pilha.imprimir();
		}
		
	}
}
