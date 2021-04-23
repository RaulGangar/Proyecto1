package com.elorrieta.primer.dia;

import java.util.Scanner;

public class Impuestos {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		float sueldo;
		System.out.print("Ingrese el sueldo:");
		sueldo = scan.nextFloat();
		if (sueldo > 3000) {
			System.out.println("Esta persona debe pagar impuestos");
		} else
			System.out.println("Esta persona no cobra tanto como para pagar");

	}

}
