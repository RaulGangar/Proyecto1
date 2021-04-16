package com_elorrieta_variables;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in) ;
		int uno;
		int dos;
		int suma;
		int prod;
		
		System.out.println("Introduce el primer digito:");
		uno=scan.nextInt();
		System.out.println("Introduce el segundo digito:");
		dos=scan.nextInt();
		suma=uno+dos;
		prod=uno*dos;
		
		System.out.println("La suma de "+uno+" y "+dos+" es "+suma+" y su producto es "+prod+".");
		
	}

}
