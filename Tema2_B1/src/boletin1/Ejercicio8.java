package boletin1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
	
		//Declaramos las variables.
				
		double nota; //Variable introducida por el usuario.
		
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
									
		Scanner sc= new Scanner (System.in);
									
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
		
		System.out.print("Introduzca su nota (puede ser un número con decimales) y pulse Intro: ");
		nota=sc.nextDouble();
		
		//Asignamos la valoración de la nota
		
		if(nota<=10&&nota>=0) {
			
			if (nota>=0&&nota<5) {
			
				System.out.println("Su nota corresponde a un insuficiente.");
			
			}else if (nota>=5&&nota<6) {
			
				System.out.println("Su nota corresponde a un suficiente.");
			
			}else if (nota>=6&&nota<7) {
			
				System.out.println("Su nota corresponde a un bien.");
			
			}else if (nota>=7&&nota<9) {
			
				System.out.println("Su nota corresponde a un notable.");
			
			}else {		
			System.out.println("Su nota corresponde a un sobresaliente.");
			
			}
			
		}else {
			System.out.println("Error, no corresponde con un número válido.");
				
			}
		
		//Por último, cerramos el escáner.
		sc.close();
		
		}
	
	}






