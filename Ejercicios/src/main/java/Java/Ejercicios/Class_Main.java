package Java.Ejercicios;

public class Class_Main {
	
	private static void inicio_programa(){
		System.out.println("                     Ejercicios de Java");
		System.out.println("=============================================================");
		System.out.println(" ");
	}
	
	public static void main( String[] args ){
		inicio_programa();
		System.out.println("Ejercicio 1:");
		Ejercicio1_CadenaCaracter.metodo('c', "miguel");
		System.out.println(" ");
		System.out.println("Ejercicio 2:");
		Ejercicio2_CadenaCaracterCont.metodo('a', "atleticodemadrid");
		System.out.println(" ");
		System.out.println("Ejercicio 3:");
		Ejercicio3_NumParImpar.metodo(5);
		System.out.println(" ");
		System.out.println("Ejercicio 4:");
		Ejercicio4_MayorEdad.metodo(18);
		System.out.println(" ");
		System.out.println("Ejercicio 5:");
		Ejercicio5_Notas.metodo(5);
		System.out.println(" ");
		System.out.println("Ejercicio 6:");
		Ejercicio6_CadenaAlReves.metodo("holaquetalestasyobien");
		System.out.println(" ");
		System.out.println("Ejercicio 7:");
		Ejercicio7_Secuencia.metodo();
	}
}
