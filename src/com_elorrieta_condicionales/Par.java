package com_elorrieta_condicionales;

import java.util.Scanner;

public class Par {

	public static void main(String[] args) {
		/*
		 * NUMERO PARES
		 * 
		 * int num;
		 * 
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * System.out.println("Introduce un numero:"); num = scan.nextInt();
		 * 
		 * boolean par = num % 2 == 0; System.out.println("Este numero es par: " + par);
		 * 
		 */

		int num;
		int inv = 0;
		int resto;
		int numinicial;

		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un numero");
		num = scan.nextInt();
		numinicial = num; // cuidado, sin esta igualacion, el numero se reinicia a 0 en el if

		// https://professor-falken.com/programacion-en-ejemplos/ejemplos-java/invertir-un-numero-entero-java/
		// formula
		while (num > 0) {
			resto = num % 10;
			inv = inv * 10 + resto;
			num /= 10;
		}
		// expresiones matematicas en java
		// http://profesores.fi-b.unam.mx/carlos/java/java_basico2_5.html

		System.out.println(inv);

		if (inv == numinicial) {
			System.out.println("Es un numero capicupa");
		} else
			System.out.println("No es capicua");

	}

}
