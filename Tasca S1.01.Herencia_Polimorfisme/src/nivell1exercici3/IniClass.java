package nivell1exercici3;

public class IniClass {
	
	//Bloc de inicialización. Tiene que esperar a que se instancie un objeto para cargarse.
	{
		System.out.println("Segon bloc d'initzialització");
	}
	/*
	Bloc static de inicialización. No importa en qué sitio esté ni cuántos objetos sean 
	instanciados, se cargará en cuanto se cargue la clase solo una vez.
	*/
	static{
		System.out.println("Primer bloc d'initzialització static");
	}
	
	//Mostrar la carga al crear un objeto
	public static void main(String[] args) {
		
		IniClass objeto = new IniClass();
	
	}
	
}
