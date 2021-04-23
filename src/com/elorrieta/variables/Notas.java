package com.elorrieta.variables;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {

		final float VALOR_30 = 0.3f;
		final float VALOR_70 = (float) 0.7;

		float nota1 = 0;
		float nota2 = 0;
		float nota3 = 0;
		float nota4 = 0;
		float nota5 = 0;
		float media = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("1 nota:");
		nota1 = Float.parseFloat(scan.nextLine());
		System.out.println("2 nota:");
		nota2 = Float.parseFloat(scan.nextLine());
		System.out.println("3 nota:");
		nota3 = Float.parseFloat(scan.nextLine());
		System.out.println("4 nota:");
		nota4 = Float.parseFloat(scan.nextLine());
		System.out.println("5 nota:");
		nota5 = Float.parseFloat(scan.nextLine());

		media = (((nota1 + nota2 + nota3 + nota4) / 4) * VALOR_30) + (nota5 * VALOR_70);

		System.out.println(media);
	}
}
