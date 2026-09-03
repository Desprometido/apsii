
public class ProgramaDasFiguras {
	public static void main(String[] args) {
		GerenteDeFiguras gerente = new GerenteDeFiguras();
		Triangulo t1 = new Triangulo(2.0, 3.0);
		gerente.adicionaFigura(t1);
		
		Losango l1 = new Losango(4.0, 2.0);
		gerente.adicionaFigura(l1);
		
		Losango l2 = new Losango(3.0, 1.0);
		gerente.adicionaFigura(l2);
		
		// Imprimir figuras
		gerente.imprimeFiguras();
		
		// Calcular e imprimir área
		System.out.println("\nÁrea total de figuras = " + gerente.calculaAreaTotalDeFiguras());
	}
}
