package Java.Ejercicios;

public class Ejercicio5_Notas {

	public static void metodo(int nota){
		String nota_escrita = " ";
		if(nota >= 0 && nota < 5){
			nota_escrita = "Usted no está Aprobado :(";
		}
		else if(nota == 5){
			nota_escrita = "APROBADO";
		}
		else if(nota == 6){
			nota_escrita = "BIEN";
		}
		else if(nota == 7 || nota == 8){
			nota_escrita = "NOTABLE";
		}
		else if(nota == 9 || nota == 10){
			nota_escrita = "SOBRESALIENTE";
		}
		else{
			nota_escrita = "La nota no es válida";
		}
		System.out.println("La nota " + nota + " equivale a un " + nota_escrita);
	}
	
}
