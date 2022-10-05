package boletin1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		//Declaramos las variables.
		
		int a; //Variable introducida por el usuario.
		int b;//Segunda variable introducida por el usuario.
					
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
					
		Scanner sc= new Scanner (System.in); 
					
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
					
		System.out.print("Introduzca un número y pulse Intro: ");
		a=sc.nextInt();
		System.out.print("Introduzca otro número y pulse Intro: ");
		b=sc.nextInt();
		
		/*Debemos ordenar los números. Para ello, preguntaremos si a>b. Si se da ese caso,
		 * imprimimos ese resultado. Si se da el caso contrario, imprimos que b>a.*/
		
		if (a<b) {
			
			System.out.println(a+" es menor que "+b);
		}
		
		else {
			
			System.out.println(b+" es menor que "+a);
		}
		
		//Por último, cerramos el escáner.
		
		sc.close();
				
	}

}
