package ejercicios.ingles.cylinder;

public class Circle {

	private int radio;
	
	public Circle(){
		
	}

	public Circle(int radio) {
		this();
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
	
	public double calcularPerímetro () {
		
		return Math.PI*radio*radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}

	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
