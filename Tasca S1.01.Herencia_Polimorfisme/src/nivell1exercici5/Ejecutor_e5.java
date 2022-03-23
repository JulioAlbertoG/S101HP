package nivell1exercici5;

public class Ejecutor_e5 {

	public static void main(String[] args) {
		
		/*
		 * Creamos el objeto de la clase gat y accedemos a los métodos que hereda
		 * de Animal y pasamos por parámetros los valores de los métodos
		 */
		Gat garfield = new Gat();
		
		garfield.correr();
		garfield.correr(2);
		garfield.correr(3, 2);
		garfield.correr(3, 2, "animal");

	}

}
