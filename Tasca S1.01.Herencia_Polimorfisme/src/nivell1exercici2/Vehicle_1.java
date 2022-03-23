package nivell1exercici2;

public class Vehicle_1 {

	//Constructor de objeto
	public Vehicle_1() {
		System.out.println("Constructor de vehicle");
	}
	//Métodos a utilizar por la clase
	public void iniciar() {
		System.out.println("Aquest vehicle està engegat");
	}
	//Método static al que se podrá acceder desde la clase sin instanciar el objeto
	public static void  parar() {
		System.out.println("El vehicle s'ha aturat");
		
	}
	//Método no-static que requiere un objeto para ser llamada
	public void accelerar() {
		System.out.println("Vigila la teva velocitat, estàs accelerant");
	}
	
}
