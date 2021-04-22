package com_elorrieta_arrays;

public class Temperaturas {

	public static void main(String[] args) {
		Integer[] temperaturas = new Integer[7];
		temperaturas[0] = 5;
		temperaturas[1] = 7;
		temperaturas[2] = 15;
		temperaturas[3] = 9;
		temperaturas[4] = 21;
		temperaturas[5] = 27;
		temperaturas[6] = 16;
		int media;
		int suma = 0;
		int mayor = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		for (int i = 0; i < temperaturas.length; i++) {
			suma += temperaturas[i];

			if (temperaturas[i] > mayor) {
				mayor = temperaturas[i];
			}
			if (temperaturas[i] < menor) {
				menor = temperaturas[i];
			}
		}
		media = suma / temperaturas.length;
		System.out.println("La media de las temperaturas es de " + media);
		System.out.println("La mayor temperatura es : " + mayor);
		System.out.println("La mayor temperatura es : " + menor);
	}
}
