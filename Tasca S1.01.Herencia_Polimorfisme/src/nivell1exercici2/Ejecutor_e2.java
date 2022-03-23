package nivell1exercici2;

public class Ejecutor_e2 {

	public static void main(String[] args) {
		
		
	//	Para llamar el método static no hace falta 
		Vehicle_1.parar();

	//Pero para el método non static sí que es necesario crear el objeto
		Vehicle_1 vehicle1 = new Vehicle_1();
		vehicle1.accelerar();
	}

}
