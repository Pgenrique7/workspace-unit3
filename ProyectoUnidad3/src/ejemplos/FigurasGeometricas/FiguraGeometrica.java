package ejemplos.FigurasGeometricas;

public abstract class FiguraGeometrica {
	
	protected EnumFigura tipoFigura;
	
	public abstract double calcularArea();
	
	public abstract double calcularPerímetro();
		
	public EnumFigura  getTipo() {
		
		return this.tipoFigura;
	}

	
}
