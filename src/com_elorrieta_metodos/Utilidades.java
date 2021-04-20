package com_elorrieta_metodos;

import java.util.Scanner;

public class Utilidades {

	public static void main(String[] args) {
		float precio = calcularIva();
		System.out.println("El precio con iva es " + precio);
		// saludar();
		/*
		 * saludar("Raul"); saludar("Ander");
		 * System.out.println("es capicua el numero 1551? " + esCapicua(1551));
		 * System.out.println("es capicua el numero 1561? " + esCapicua(1561));
		 */
	}

	public static float calcularIva() {
		Scanner scan = new Scanner(System.in);
		float precio;
		float iva = 0;
		float precioSinIva = 0;
		System.out.println("Di cuanto cuesta el producto para saber su valor final con Iva");
		precioSinIva = scan.nextFloat();
		if (precioSinIva >= 1000 && precioSinIva < 2000) {
			precio = (precioSinIva * 5 / 100) + precioSinIva;
		} else if (precioSinIva >= 2000 && precioSinIva < 5000) {
			precio = (precioSinIva * 10 / 100) + precioSinIva;
		} else if (precioSinIva >= 5000) {
			precio = (precioSinIva * 25 / 100) + precioSinIva;
		} else
			precio = precioSinIva;
		return precio;
	}

	/*
	 * public static void saludar() { System.out.println("Hombreeee que pasa"); }
	 */
	public static void saludar(String nombre) {
		System.out.println("Hombreeee que pasa " + nombre);
	}

	public static boolean esCapicua(int num) {

		int inv = 0;
		int resto;
		int numinicial;

		numinicial = num;
		while (num > 0) {
			resto = num % 10;
			inv = inv * 10 + resto;
			num /= 10;
		}
		/*
		 * boolean capicua = numinicial == inv; System.out.println(capicua); return
		 * capicua;
		 */
		return numinicial == inv;
	}
}
