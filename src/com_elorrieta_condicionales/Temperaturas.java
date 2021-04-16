package com_elorrieta_condicionales;

import java.util.Scanner;

public class Temperaturas {

	public static void main(String[] args) {
		/*
		 * Scanner scan = new Scanner(System.in); float temp1; float temp2; float temp3;
		 * float media;
		 * 
		 * System.out.println("Introduce 3 temperaturas."); temp1 = scan.nextFloat();
		 * temp2 = scan.nextFloat(); temp3 = scan.nextFloat(); media = (temp1 + temp2 +
		 * temp3) / 3; while (media != 18) {
		 * System.out.println("Introduce nuevas temperaturas:"); temp1 =
		 * scan.nextFloat(); temp2 = scan.nextFloat(); temp3 = scan.nextFloat(); }
		 * System.out.println("Mmmmmmm, temperatura perfecta");
		 */
		float temperatura = 0;
		float total = 0;
		int numeroTemperaturas = 0;

		final int SALIR = 888;
		Scanner scan = new Scanner(System.in);

		// System.out.println("Introduce temperaturas.");

		// bucle para pedir temperaturas y sumarlas
		while (temperatura != SALIR) {

			System.out.println("Introduce la temperatura (o 888 para salir):");
			temperatura = scan.nextFloat();
			if (temperatura != SALIR) {
				total += temperatura; // total = total + temperatura
				numeroTemperaturas++;
			}
		}

		System.out.println("Media : " + (total / numeroTemperaturas));
		scan.close();
	}

}
