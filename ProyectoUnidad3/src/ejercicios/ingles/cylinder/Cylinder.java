package ejercicios.ingles.cylinder;

public class Cylinder extends Circle {

	   private double height = 0.0;

	   public Cylinder() {

	   }

	   public Cylinder(double radius) {

	       super();
	   }

	   public Cylinder(double radius, double height) {

	       super();
	       this.height = height;
	   }

	   public Cylinder(double radius, double height, String color) {

	       super();
	       this.height = height;
	   }

	   public double getHeight() {
	       return height;
	   }

	   public void setHeight(double height) {
	       this.height = height;
	   }
	   
	   
	   @Override
	   public double getArea() {

	       return 2 * Math.PI * this.height + 2 * Math.PI * Math.pow(this.getRadio(), 2);
	   }

	   public double getVolume() {

	       return 0.0;

	   }

	}