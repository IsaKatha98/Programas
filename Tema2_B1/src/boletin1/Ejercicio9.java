package boletin1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
	
	//Declaramos las variables.
		
		int j1; //Jugador 1.
		int j2;//Jugador 2.
	
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
									
		Scanner sc= new Scanner (System.in); 
									
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
									
		System.out.print("Jugador1, introduzca -1=Piedra, 0=Papel o 1=Tijera y pulse Intro: ");
		j1=sc.nextInt();
		System.out.print("Jugador2, introduzca -1=Piedra, 0=Papel o 1=Tijera y pulse Intro: ");
		j2=sc.nextInt();
		
		//Instrucciones
		
		if (j1==j2) {
			System.out.println("Ha habido empate.");
			
		} else if (j1==0&&j2==-1) {
			System.out.println("Gana Jugador1.");
			
		}else if (j1==1&&j2==-1) {
			System.out.println("Gana Jugador2.");
			
		}else if (j1==-1&&j2==0) {
			System.out.println("Gana Jugador2.");
			
		}else if (j1==1&&j2==0) {
			System.out.println("Gana Jugador1.");
		
		}else if (j1==-1&&j2==1) {
			System.out.println("Gana Jugador1.");
			
		}else if (j1==0&&j2==1) {
			System.out.println("Gana Jugador2.");
			
		}
	
		//Por último, cerramos el escáner.
		
		sc.close();

		}
		
	}
	
	
	