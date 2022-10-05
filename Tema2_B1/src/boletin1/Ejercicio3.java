package boletin1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//Declaramos las variables.
		
		double num; //Variable introducida por el usuario.
			
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
			
		Scanner sc= new Scanner (System.in); 
			
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
			
		System.out.print("Introduzca un número decimal y pulse Intro: ");
		num=sc.nextDouble();
		
		/*Queremos saber si el número introducido es un número casi-cero. Es decir, si se encuentra en el
		intervalo (-1,1) sin ser ni 0 ni 1. Por lo tanto, deberemos crear una condicional que pregunte
		si el número introducido por el usuario pertenece a este intervalo y no sea ni -1, 1 o 0.*/

		//Esbozamos la condicional.
		
		if (num>-1&&num<1&&num!=0){
			
			System.out.println("El número introducido es un número casi-cero.");	
		}
		
		else {
			
			System.out.println("El número introducido no es un número casi-cero.");	
		}
		
		//Por último, cerramos el escáner.
		
		sc.close();

	}

}
