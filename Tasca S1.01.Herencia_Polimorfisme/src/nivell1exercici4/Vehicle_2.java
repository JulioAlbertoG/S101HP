package nivell1exercici4;

public class Vehicle_2 {
	
	/*
	 * El primer atributo se puede considerar una constante. Al utilizar
	 * la palabra static la hace un atributo común de toda la clase y de
	 * los objetos que puedan surgir de ella. Pero al agregarle el final,
	 * hacemos que no se pueda modificar y la hacemos constante
	 */
	public static final int velocitats = 6;
	/*
	 * Para el segundo atributo tenemos solo el final que lo hace también
	 * una constante, pero la cual no se inicializará hasta que hayamos
	 * creado el objeto.
	 */
	public final String tipus = "de cuatre rodes";
	/*
	 * En este caso, el tercer atributo también tiene la palabra static,
	 * lo cual hace que se inicialice al cargarse la clase, sin necesidad de
	 * instanciar al objeto.
	 */
	public static int rodes = 4;
	
/*
	public Vehicle_2() {
		System.out.println("Constructor de vehicle");
	}
*/
	public void iniciar() {
		System.out.println("Aquest vehicle està engegat");
	}

	public static void  parar() {
		System.out.println("El vehicle s'ha aturat");
		
	}

	public void accelerar() {
		System.out.println("Vigila la teva velocitat, estàs accelerant");
	}

}
