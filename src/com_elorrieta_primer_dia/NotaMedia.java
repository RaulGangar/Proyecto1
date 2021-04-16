package com_elorrieta_primer_dia;

import java.util.Scanner;

public class NotaMedia {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int nota1;
		int nota2;
		int nota3;
		int prom;

		System.out.println("Ingrese la primera nota:");
		nota1 = scan.nextInt();
		System.out.println("Ingrese la segunda nota:");
		nota2 = scan.nextInt();
		System.out.println("Ingrese la tercera nota:");
		nota3 = scan.nextInt();
		prom = (nota1 + nota2 + nota3) / 3;
		if (prom >= 7) {
			System.out.println("Promocionado");
		} else {
			if (prom >= 4) {
				System.out.println("Regular");
			} else
				System.out.println("Reprobado");
		}

	}
}
