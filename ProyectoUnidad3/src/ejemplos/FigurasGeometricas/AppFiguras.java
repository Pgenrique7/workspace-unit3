package ejemplos.FigurasGeometricas;

public class AppFiguras {

	   public static void main(String[] args) {
	       // TODO Auto-generated method stub
	       FiguraGeometrica[] arrayFiguras = new FiguraGeometrica[5];

	       Circulo cir = new Circulo(10);
	       Circulo cir2;

	       FiguraGeometrica varSuperCirculo = new Circulo(15);
	       FiguraGeometrica varSuperRectangulo = new Rectangulo(5, 10);
	       cir.getRadio();

	       if (varSuperCirculo instanceof Circulo)
	           cir2 = (Circulo) varSuperCirculo;

	       // da fallo

	       if (varSuperRectangulo instanceof Circulo)
	           cir2 = (Circulo) varSuperRectangulo;

	       arrayFiguras[0] = cir;
	       arrayFiguras[1] = new Cuadrado(5);
	       arrayFiguras[2] = new Rectangulo(4, 8);
	       arrayFiguras[3] = new Cuadrado(5);
	       arrayFiguras[4] = new TriánguloRectángulo(3, 7);

	       cir = (Circulo) arrayFiguras[2];

	       System.out.println(cir.calcularArea());

	   }
}