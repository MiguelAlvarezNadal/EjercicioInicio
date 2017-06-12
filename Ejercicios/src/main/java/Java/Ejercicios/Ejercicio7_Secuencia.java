package Java.Ejercicios;

public class Ejercicio7_Secuencia {

	public static void metodo(){
		int numero = 0;
		String secuencia = "";
		while(numero < 99){
			numero = numero + 3;
			secuencia = secuencia + " " + numero;
		}
		System.out.println("Mostramos la secuencia de numeros multiplos de 3 hasta 99: " + secuencia);
	}
}
