package Java.Ejercicios;

public class Ejercicio1_CadenaCaracter {

	public static void metodo(char caracter, String cadena) {
		String esta = "no";
		for (int i = 0; i < cadena.length(); i++) {
			if(caracter == cadena.charAt(i)){
				esta = "si";
				break;
			}
			else{
				esta = "no";
			}
		}
		System.out.println("La letra " + caracter + " " + esta + " está en la cadena '" + cadena + "'.");
	}
}
