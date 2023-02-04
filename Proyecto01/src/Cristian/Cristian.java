package Cristian;

	public class Cristian {
		public static void main(String[] args) {
	
			saludo("Cristian");
			hobbies();
			comidasFavoritas();
}

	public static void saludo (String nombre) {
			System.out.println("Hola, soy " + nombre);
	
}
	public static void hobbies () {
		String hobbieUno = "leer";
		String hobbieDos = "senderismo";
		String hobbieTres = "nadar";
		
		System.out.println("Tres de mis hobbies son: " + hobbieUno + ", " + hobbieDos + " y " + hobbieTres);
	}
	
	public static void comidasFavoritas () {
		String comidaUno = "arroz";
		String comidaDos = "hamburguesas";
		String comidaTres = "pasta";
		
		System.out.println("Mis tres platos favoritos son: " + comidaUno + ", " + comidaDos + " y " + comidaTres);

	}
	
}
