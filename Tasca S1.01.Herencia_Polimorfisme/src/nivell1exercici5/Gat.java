package nivell1exercici5;

public class Gat extends Animal {
	
	/*
	 * Esta clase heredará de animal los métodos sobrecargados y agregará uno
	 * más, que en este caso será un string
	 */
	public void correr(int hrs, int km, String gat) {
		System.out.println("He corregut " + km + "kms y he trigat " + hrs +"hores." + " He corregut més que qualsevol " + gat);
	}
	

}
