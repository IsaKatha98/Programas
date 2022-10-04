package boletin1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Declaramos las variables.
		
		int a;//Variable introducida por el usuario.
		int b;//Segunda variable introducida por el usuario.
			
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
			
		Scanner sc= new Scanner (System.in); 
			
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
			
		System.out.print("Introduzca un número y pulse Intro: ");
		a=sc.nextInt();
		System.out.print("Introduzca otro número y pulse Intro: ");
		b=sc.nextInt();
			
		/*Le preguntamos si los números son iguales. En caso afirmativo, se mostrará como tal.
		 * En el caso contrario, se mostrará por pantalla, que los números son distintos.*/
			
		if (a==b){
			System.out.println("Ambos números son iguales.");
		} else { 
			System.out.println("Los números son distintos.");
		}
			
		//Por último, cerramos el escáner.
			
		sc.close();


	}

}
