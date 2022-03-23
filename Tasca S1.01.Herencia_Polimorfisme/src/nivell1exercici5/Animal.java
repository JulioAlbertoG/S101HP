package nivell1exercici5;

public class Animal {
	/*
	 * Sobrecargamos los tres métodos y lanzamos un mensaje por cada uno de ellos
	 */
	public void correr() {
		System.out.println("Mètode sense paràmetres");
	}
	
	public void correr(int km) {
		System.out.println("He corregut " + km + "kms");
	}
	
	public void correr(int hrs, int km) {
		
		System.out.println("He corregut " + km + "kms y he trigat " + hrs +"hores"  );
	}

}
