package boletin1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
	
	//Declaramos las variables.
		
		/*Como se haría: 
		 * final String PIEDRA="Piedra";
		 * final String PAPEL="Papel";
		 * final String TIJERAS="Tijeras";
		 * String jugador1;
		 * String jugador2;*/
		
		int j1; //Jugador 1.
		int j2;//Jugador 2.
		
		final int PIEDRA = 1;
		final int PAPEL=2;
		final int TIJERAS=3;
	
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
									
		Scanner sc= new Scanner (System.in); 
									
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
									
		System.out.print("Jugador1, introduzca Piedra [1], Papel [2] o Tijeras [3] y pulse Intro: ");
		j1=sc.nextInt();
		System.out.print("Jugador2, introduzca Piedra [1], Papel [2] o Tijeras [3] y pulse Intro: ");
		j2=sc.nextInt();
		
		//Instrucciones
		
		if (j1==j2) {
			System.out.println("Ha habido empate.");
			
		} else if (j1==PIEDRA&&j2==TIJERAS ||//Ponemos cualquier situación en la que gana Jugador1.
					j1==PAPEL&&j2==PIEDRA ||
					j1==TIJERAS&&j2==PAPEL) {
			System.out.println("Gana Jugador1.");
			
		}else {
			System.out.println("Gana Jugador2.");
			
		}
	
		//Por último, cerramos el escáner.
		
		sc.close();

		}
		
	}
	
	
	