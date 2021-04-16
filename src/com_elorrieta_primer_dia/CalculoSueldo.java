package com_elorrieta_primer_dia;

import java.util.Scanner;

public class CalculoSueldo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float sueldo;
		int horastrabajadas;
		float costohora;
		System.out.println("Introduce las horas trabajadas:");
		horastrabajadas = scan.nextInt();
		System.out.println("Introduce el coste de las horas:");
		costohora = scan.nextFloat();

		sueldo = horastrabajadas * costohora;
		System.out.println(
				"El sueldo total para " + horastrabajadas + " con un costo de " + costohora + " es de " + sueldo + ".");

	}
}
