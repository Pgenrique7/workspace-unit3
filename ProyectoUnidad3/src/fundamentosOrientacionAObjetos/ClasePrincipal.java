package fundamentosOrientacionAObjetos;

public class ClasePrincipal {

	public static void main(String[] args) {
		
		
		Object obj =new Object();
		Coche miCoche= new Coche();
		String s = new String("hola");
		String s2="hola";
		
		System.out.println(miCoche.toString());
		System.out.println(obj.toString());
		//ATRIBUTOS PUBLICOS NO
		
		
		Coche miTesla = new Coche("Rojo", "Tesla", "S");
		miTesla.repintar("Amarillo"); 
		
		System.out.println(miTesla);
		
		
		System.out.println("Numero de coches creados: "+Coche.numCoches());
		
		miTesla.setModelo("S High Performance");
		
		System.out.println(miTesla);
		
		miCoche.setMarca ("Ford");
		
		miCoche.setModelo ("Fiesta");
		
		System.out.println(miCoche);
		
		miCoche.setColor(miTesla.getColor());
		
		System.out.println(miCoche);
	}

}
