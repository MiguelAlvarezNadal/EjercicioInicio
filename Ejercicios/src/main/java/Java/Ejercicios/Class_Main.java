package Java.Ejercicios;

public class Class_Main {
	
	private static void inicio_programa(){
		System.out.println("                     Ejercicios de Java");
		System.out.println("=============================================================");
		System.out.println(" ");
	}
	
	public static void main( String[] args ){
		inicio_programa();
		Ejercicio1_CadenaCaracter.metodo('c', "miguel");
		Ejercicio2_CadenaCaracterCont.metodo('a', "atleticodemadrid");
		Ejercicio3_NumParImpar.metodo(5);
		Ejercicio4_MayorEdad.metodo(18);
		Ejercicio5_Notas.metodo(5);
		Ejercicio6_CadenaAlReves.metodo("holaquetalestasyobien");
		Ejercicio7_Secuencia.metodo();
	}
}
