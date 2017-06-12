package Java.Ejercicios;

import java.util.Scanner;

public class Ejercicio4_MayorEdad {

	public static void peticion_edad(){
		System.out.println("Dime su edad.");
	}
	
	public static int leer_edad(){
		int edad = 0;
		Scanner scanner = null;
		scanner = new Scanner(System.in);
		edad = scanner.nextInt();	
		return edad;
	}
	
	public static void metodo(int edad){
		String es = " ";
		if(edad >= 18){
			es = "mayor de edad";
		}
		else{
			es = "menor de edad";
		}
		System.out.println("Con " + edad + " años eres " + es + ".");
	}

}
