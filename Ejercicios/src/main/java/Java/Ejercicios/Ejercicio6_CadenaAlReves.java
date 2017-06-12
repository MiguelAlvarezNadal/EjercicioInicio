package Java.Ejercicios;

public class Ejercicio6_CadenaAlReves {

	public static void metodo(String cadena) {
		String cadena_final = "";
		char caracter = ' ';
		for (int i = cadena.length() - 1; i >= 0; i--) {
			caracter = cadena.charAt(i);
			cadena_final = cadena_final + caracter;
		}
		System.out.println("El resultado de colocar al reves la cadena '" + cadena + "' es '" + cadena_final + "'.");
	}
}
