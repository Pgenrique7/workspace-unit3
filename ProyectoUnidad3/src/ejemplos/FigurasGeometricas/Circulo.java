package ejemplos.FigurasGeometricas;

public class Circulo extends FiguraGeometrica{

	private int radio;
	
	public Circulo(){
		
		this.tipoFigura=EnumFigura.ELIPSES;
		
	}

	public Circulo(int radio) {
		this();
		this.radio = radio;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	@Override
	public double calcularArea() {
		
		return 2*Math.PI*radio;
	}
	
	@Override
	public double calcularPerímetro () {
		
		return Math.PI*radio*radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}
	
	
	
}
