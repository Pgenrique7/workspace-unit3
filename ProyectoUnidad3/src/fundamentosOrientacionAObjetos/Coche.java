package fundamentosOrientacionAObjetos;

public abstract class Coche {

	//atributos
	private static int numCoches=0;
	private String color;
	private String marca;
	private String modelo;
	private double precio;
	private double coste;
	
	//ATRIBUTOS PUBLICOS NO
	//public string publica;
	
	
	//constructores
	
	public Coche() {
		
		numCoches++;
		System.out.println("Numero de doches creados: ");
		
	}
	
	public Coche(String color, String marca, String modelo, double precio, double coste) {
		
		this();
		this.color=color;
		this.marca=marca;
		this.modelo=modelo;
		this.precio=precio;
		this.coste=coste;
	}
	
	public abstract String getTipoCoche();

	
	public String getColor() {
		
		
		return color;
	}
	
	public void setColor (String color) {
		
		
		this.color=color;
	}
	
	public String getMarca() {
	
		
		return marca;
	}
	
	
	
	public void setMarca (String marca) {
		
		this.marca=marca;
		
		
		
		
	}
	
	
	public String getModelo(){
		
		return modelo;
	}
	
	public void setModelo (String modelo) {
		
		
		this.modelo=modelo;
	}
	
	
	
	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getCoste() {
		return coste;
	}

	public void setCoste(double coste) {
		this.coste = coste;
	}
	
	

	public void repintar (String color) {
		
		this.color=color;
	}
	
	public static int numCoches() {
		
		
		return numCoches;
	}
	
	
	public double beneficios(double iva) {
		
		return (precio-coste) -impuestos(iva);
		
		
		}
	
	
	private double impuestos( double iva) {
		
		
		return (precio-coste)* iva;
		
		
		}

	@Override
	public String toString() {
		return "Coche [color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", coste="
				+ coste + "]";
	}
	
	
	
	
	
}
