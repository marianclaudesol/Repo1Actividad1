package libertad;

public class Libertad {
	
public static void saludoNombre(String nombre) {
	String resultado = "Hola soy " + nombre;
	System.out.println(resultado);	
}

public static void main(String[] args) {
	saludoNombre("Libertad");
	
	System.out.println("Mis hobbies son:");
	System.out.println("- Correr");
	System.out.println("- Nadar");
	System.out.println("- Viajar");
	
}
}


