package ejemplos.FigurasGeometricas;

public class Rectangulo extends FiguraGeometrica {
	
	private int base;
	private int altura;
	
	public Rectangulo() {
		
		this.tipoFigura=EnumFigura.ELIPSES;		
	}

	public Rectangulo(int base, int altura) {
		this();
		this.base = base;
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		
		return base*altura;
	}
	
	
	@Override
	public double calcularPerímetro() {
		
		return (base*2)+(altura*2);
	}
	
	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + "]";
	}
	
	
	

}
