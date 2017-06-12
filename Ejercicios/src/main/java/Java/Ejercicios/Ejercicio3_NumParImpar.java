package Java.Ejercicios;

public class Ejercicio3_NumParImpar {

	public static void metodo(int numero){
		String como_es = " ";
		if(numero %2 == 0){
			como_es = "par";
		}
		else{
			como_es = "impar";
		}
		System.out.println("El numero " + numero + " es " + como_es);
	}
}
