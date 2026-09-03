import java.util.ArrayList;
import java.util.List;

public class GerenteDeFiguras {
	private List<FiguraGeometrica> figuras;
	public GerenteDeFiguras(){
		figuras = new ArrayList<FiguraGeometrica>();
	}
	
	public void adicionaFigura(FiguraGeometrica figura) {
		this.figuras.add(figura);
	}
	
	public void imprimeFiguras() {
		System.out.println("---Figuras Cadastradas");
		for (FiguraGeometrica figura : figuras) {
			System.out.println(figura.getNomeFigura());
		}
	}
	
	public double getMaiorAreaDeFigura() {
		if (figuras.isEmpty()) {
			return 0.0;
		}
		
		double maiorArea = figuras.get(0).calculaArea();
		for (FiguraGeometrica figura : figuras) {
			if (figura.calculaArea() > maiorArea) {
				maiorArea = figura.calculaArea();
			}
		}
		return maiorArea;
	}
	
	public double calculaAreaTotalDeFiguras() {
		double areaTotal = 0;
		
		for (FiguraGeometrica figura : figuras) {
			areaTotal += figura.calculaArea();
		}
		return areaTotal;
	}
}
