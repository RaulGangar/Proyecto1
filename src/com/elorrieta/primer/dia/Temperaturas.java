package com.elorrieta.primer.dia;

import java.util.Scanner;

public class Temperaturas {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		float media;
		float lunes;
		float martes;
		float miercoles;
		float jueves;
		float viernes;
		float sabado;
		float domingo;
		final int Dias_semana = 7; // final es para indicar que es una constante, siempre en mayus

		System.out.println("Introduce las temperaturas de cada dia:");
		lunes = scan.nextInt();
		martes = scan.nextInt();
		miercoles = scan.nextInt();
		jueves = scan.nextInt();
		viernes = scan.nextInt();
		sabado = scan.nextInt();
		domingo = scan.nextInt();
		media = (lunes + martes + miercoles + jueves + viernes + sabado + domingo) / Dias_semana;

		if (media >= 17) {
			System.out.println(media + " grados de media... Ha echo una temperatura media muy agradable.");
		} else
			System.out.println(media + " grados de media... Uyyyy que fresquito.");

	}
}
