package nivell1exercici4;

public class Ejecutor_e4 {

	public static void main(String[] args) {
		
		Vehicle_2 cotxe = new Vehicle_2();
		Vehicle_2 camio = new Vehicle_2();
		Vehicle_2 tractor = new Vehicle_2();
		
		System.out.println("Tots els vehicles tenen " + Vehicle_2.velocitats + " velocitats");
		System.out.println("Aquest vehicle (cotxe) es del següent tipus: " + cotxe.tipus);
		System.out.println("Tots els vehicles tenen " + Vehicle_2.rodes + "rodes");
	}

}
