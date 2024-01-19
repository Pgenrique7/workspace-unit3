package ejemplos.FigurasGeometricas;

public class Cuadrado {
	
	private int lado;
	
	public Cuadrado() {
		
	}

	public Cuadrado(int lado) {
		this.lado = lado;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public double calcularArea() {
		
		return lado*lado;
	}
	
	public double calcularPerimetro() {
		
		return lado*4;
	}
	
	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + "]";
	}
	
	
	
	
}
