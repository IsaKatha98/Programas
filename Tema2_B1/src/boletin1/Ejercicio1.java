package boletin1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
	//Declaramos las variables.
		
	int num; //Variable introducida por el usuario.
		
	/*Creamos un escáner para poder leer los datos que introduzca el usuario por
	la consola. */
		
	Scanner sc= new Scanner (System.in); 
		
	//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
		
	System.out.print("Introduzca un número y pulse Intro: ");
	num=sc.nextInt();
		
	/*Le preguntamos si es par o impar. En el caso de que sea par, se mostrará como tal.
	 * En el caso contrario, se mostrará por pantalla, que es impar.*/
		
	if (num%2==0){
		System.out.println("El número es par.");
	} else { 
		System.out.println("El número es impar.");
	}
		
	//Por último, cerramos el escáner.
		
	sc.close();

}

}
