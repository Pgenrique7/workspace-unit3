package ejemplos.FigurasGeometricas;
	

public class TriánguloRectángulo  extends FiguraGeometrica{
	
	// Atributos de objeto.
	private int base;
	private int altura;
	
	// Atributos de clase.	
	// Bloque STATIC
	
	// Constructores
	public TriánguloRectángulo() {
		
		this.tipoFigura=EnumFigura.POLIGONOS;
		
	}
	
	public TriánguloRectángulo(int altura, int base) {
		this();
		this.altura=altura;
		this.base=base;
	}
	
	// Metodos estaticos
	
	// Metodos de acceso
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

	// Metodos funcionales
	@Override
	public double calcularArea() {
		// La formula de clacular el area de un triangulo es Area = 1/2 * (base*altura)
		return (float)((base*altura)/2);
	}
	
	@Override
	public double calcularPerímetro(){
		// La formula para calcular el perimetro de un triangulo Perímetro = (2 x base) + (2 x altura)
		return (float)((base*2) + (altura*2));
	}
	
	public double calcularHipotenusa() {
		// La formula para calcular la hipotenusa es A^2 + B^2 = C^2 -> RaizCuad de C
		return Math.sqrt((altura*altura) + (base*base));		
	}
	
	
	public void determinarTipoTriangulo(){
		// PAra determinar que tipo de triangulo rectangulo tenemos 
		if (altura==base) {
			System.out.println("Triangulo de tipo Isósceles");
		}
		
		else {
			System.out.println("Triangulo de tipo Escaleno");
		}
		
	}
	
	// Metodos polimorficos.
	
}