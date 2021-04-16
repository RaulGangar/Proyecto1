package com_elorrieta_metodos;

import java.util.Scanner;

public class Utilidades {

	public static void main(String[] args) {

		// saludar();
		saludar("Raul");
		saludar("Ander");
		EsCapicua();

	}

	/*
	 * public static void saludar() { System.out.println("Hombreeee que pasa"); }
	 */
	public static void saludar(String nombre) {
		System.out.println("Hombreeee que pasa " + nombre);
	}

	public static boolean EsCapicua() {

		int num;
		int inv = 0;
		int resto;
		int numinicial;

		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un numero");
		num = scan.nextInt();
		numinicial = num;
		while (num > 0) {
			resto = num % 10;
			inv = inv * 10 + resto;
			num /= 10;
		}
		System.out.println(inv);
		boolean capicua = numinicial == inv;
		System.out.println("Este numero es capicua: " + capicua);

		return capicua;
	}
}
