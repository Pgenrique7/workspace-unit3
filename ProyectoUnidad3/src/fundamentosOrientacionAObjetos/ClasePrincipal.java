package fundamentosOrientacionAObjetos;

public class ClasePrincipal {

	public static void main(String[] args) {
		
		
		Object obj =new Object();
		Coche miCoche= new SUV("Rojo", "Ford", "Mondeo",25000,15000);
		String s = new String("hola");
		String s2="hola";
		
		System.out.println(miCoche.toString());
		System.out.println(obj.toString());
		//ATRIBUTOS PUBLICOS NO
		
		
		Coche miTesla = new Sedan("Rojo", "Tesla", "S",25000,15000, 5);
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
		
		System.out.println("Beneficios: "+miTesla.beneficios(0.18));
		
		SUV miTeslaSUV = new SUV ("Azul","Tesla","Model E", 35000, 30000);
		
		System.out.println("Mi SUV "+ miTeslaSUV);
	}

}
