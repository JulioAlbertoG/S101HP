package nivell1exercici8;

public class Ejecutor_e8 {

	public static void main(String[] args) {
		/*
		 * Con la generalización sustituye los valores de Amphibian por los puestos en la clase Frog
		 * Aunque el programa eclipse nos advierte de un error lo ejecuta.
		 */
		Amphibian gripau = new Frog();
		
		gripau.moure();
		gripau.respirar();
		gripau.menjar();
		/*
		 * Sin la generalización Funciona también y presenta la nueva definición de los métodos de la
		 * clase Frog
		 */
		Frog granota = new Frog();
		
		granota.moure();
		granota.respirar();
		granota.menjar();
	}

}
