package ejemplos.FigurasGeometricas;

public class Circulo {

	private int radio;
	
	public Circulo(){
		
	}

	public Circulo(int radio) {
		this.radio = radio;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	
	public double calcularArea() {
		
		return 2*Math.PI*radio;
	}
	
	public double calcularPerimetro () {
		
		return Math.PI*radio*radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}
	
	
	
}
