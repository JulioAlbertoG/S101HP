package nivell1exercici6;

public class Ejecutor_e6 {

	public static void main(String[] args) {
		/*
		Hacemos la generalización declarando la variable de tipo amphibian, aunque el objeto es
		de tipo frog
		*/
		Amphibian gripau = new Frog();
		
		gripau.moure();
		gripau.respirar();
		gripau.menjar();

	}

}
