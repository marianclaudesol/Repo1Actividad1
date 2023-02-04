package Cristian;

	public class Cristian {
		public static void main(String[] args) {
	
			saludo("Cristian");
			hobbies();
			comida();
	
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
	public static void comida () {
		String comidaUno = "Paella";
		String comidaDos = "Aguacate";
		String comidaTres = "Queso";
		
		System.out.println("Tres de mis hobbies son: " + comidaUno + ", " + comidaDos + " y " + comidaTres);
	}
	
}
