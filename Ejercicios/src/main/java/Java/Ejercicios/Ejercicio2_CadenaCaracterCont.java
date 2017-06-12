package Java.Ejercicios;

public class Ejercicio2_CadenaCaracterCont {
	
	public static void metodo(char caracter, String cadena){
		int contador = 0;
		for(int i = 0; i<cadena.length(); i++){
			if(caracter == cadena.charAt(i)){
				contador++;
			}
		}
		System.out.println("El numero " + caracter + " se repite " + contador + " veces en la cadena '" + cadena + "'.");
	}
	
}
