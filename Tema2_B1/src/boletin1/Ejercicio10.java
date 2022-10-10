package boletin1;

import java.util.Scanner;

public class Ejercicio10 {

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
		
		//Instrucciones.
		
		if(c==a+b) {
			System.out.println("La sumatoria de "+a+" más "+b+" da como resultado "+c);
			
		}else if (b==a+c){
			System.out.println("La sumatoria de "+a+" más "+c+" da como resultado "+b);
			
		}else if (a==b+c) {
			System.out.println("La sumatoria de "+b+" más "+c+" da como resultado "+a);
		
		} else {
			System.out.println("Ninguno de los números es el resultado de la sumatoria de los otros dos.");
			
		}

		//Por último, cerramos el escáner.
		
		sc.close();
	}

}
