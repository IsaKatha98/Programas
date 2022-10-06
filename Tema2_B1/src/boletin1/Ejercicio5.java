package boletin1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		//Declaramos las variables.
		
		int a; //Variable introducida por el usuario.
		int b;//Segunda variable introducida por el usuario.
		int c;//Tercera variable introducida por el usuario.
		
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
							
		Scanner sc= new Scanner (System.in); 
							
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
							
		System.out.print("Introduzca un número y pulse Intro: ");
		a=sc.nextInt();
		System.out.print("Introduzca otro número y pulse Intro: ");
		b=sc.nextInt();
		System.out.print("Introduzca otro número y pulse Intro: ");
		c=sc.nextInt();
		
		//Para ordenarlos de mayor a menor hay que comparar si a>b
		
		if (a>b&&b>c) {
			
			System.out.println(a+">"+b+">"+c);
		}
		
		else if (a>c&&c>b) {
			
			System.out.println(a+">"+c+">"+b);
		}
		
		else if (b>a &&a>c) {
			
			System.out.println(b+">"+a+">"+c);
		}
		
		else if (b>c&&c>a) {
			
			System.out.println(b+">"+c+">"+a);
		}
		
		else if (c>a&&a>b) {
			
			System.out.println(c+">"+a+">"+b);
		}
		
		else {
			
			System.out.println(c+">"+b+">"+a);
		}
		
		//Por último, cerramos el escáner.
		
		sc.close();
	}

}
