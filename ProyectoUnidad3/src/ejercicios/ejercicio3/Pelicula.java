package ejercicios.ejercicio3;

public class Pelicula {

	private String pelicula;
	private String director;
	private enumPeliculas genero;
	
	//Duracion en minutos porque es un int 
	private int ano;
	private int duracion; 
	private double calificacion;
	
	
	public Pelicula () {
		
	}



	public Pelicula(String pelicula, String director, enumPeliculas genero, int ano, int duracion, double calificacion) {
		this.pelicula = pelicula;
		this.director = director;
		this.genero = genero;
		this.ano = ano;
		this.duracion = duracion;
		this.calificacion = calificacion;
	}



	public String getPelicula() {
		return pelicula;
	}


	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}


	public int getDuracion() {
		return duracion;
	}


	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}


	public double getCalificacion() {
		return calificacion;
	}


	public void setCalificacion(double calificaion) {
		this.calificacion = calificaion;
	}
	
	public boolean esPeliculaEpica() {
		
		
		return this.duracion>=180;
	}
	
	public String calcularValoración () {
		
		String resultado="";
		
		if (this.calificacion<=EnumCalificacion.MUY_MALA.getMaxCalificacion()) {
			
			resultado= EnumCalificacion.MUY_MALA.getDescripcion();
			
		}else if (this.calificacion<=EnumCalificacion.MALA.getMaxCalificacion()) {
			
			resultado =EnumCalificacion.MALA.getDescripcion();
			
		}else if (this.calificacion<=EnumCalificacion.REGULAR.getMaxCalificacion()) {
			
			resultado=EnumCalificacion.REGULAR.getDescripcion();
			
		}else if (this.calificacion<=EnumCalificacion.BUENA.getMaxCalificacion()) {
			
			resultado=EnumCalificacion.BUENA.getDescripcion();
			
		}else {
			
			resultado=EnumCalificacion.MUY_BUENA.getDescripcion();
			
		}
		
		return resultado;
		
	}
	
	
	public boolean esSimilar (Pelicula pelicula) {
		
		
		return (this.genero.equals(pelicula) && 
				this.calificacion==pelicula.getCalificacion());
	}
	

	@Override
	public String toString() {
		return "pelicula [pelicula=" + pelicula + ", director=" + director + ", duracion=" + duracion + ", ano=" + ano
				+ ", calificaion=" + calificacion + "]";
	}
	
	
}

