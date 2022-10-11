package boletin1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
	//Declaramos las variables.
		
	int a; //Variable introducida por el usuario.
	int b;//Segunda variable introducida por el usuario.
	int c;//Tercera variable introducida por el usuario.
	final int RAIZ;//La raíz cuadrada de la ecuación de segundo grado  
	double x1;//Variable resultado.
	double x2;//Variable resultado.
		
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
	
	//Ejecutamos la ecuación de segundo grado
	
	RAIZ = b*b-4*a*c;
	
	if(RAIZ<0) {
		
		System.out.println("ERROR");
		
	} else  {
		
		x1=
		
		System.out.println("Da como resultado: "+x1);
		
		
	}

		
		/*x1=((-b)+Math.sqrt((b*b)-(4*a*c)))/(2*a);
		x2=((-b)-Math.sqrt((b*b)-(4*a*c)))/(2*a);*/
		
		
		//System.out.println("Da como resultado: "+x1+" y "+x2);
	
			
	}

}
