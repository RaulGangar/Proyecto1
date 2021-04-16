package com_elorrieta_condicionales;

import java.util.Scanner;

public class EjercicioAnd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		System.out.print("Introduce primer numero:");
		num1 = scan.nextInt();
		System.out.print("Introduce segundo numero:");
		num2 = scan.nextInt();
		System.out.print("Introduce tercer numero:");
		num3 = scan.nextInt();
		if (num1 > num2 && num1 > num3) {
			System.out.print("El numero mas alto introducido es " + num1);
		} else {
			if (num2 > num3) {
				System.out.print("El numero mas alto introducido es " + num2);
			} else {
				System.out.print("El numero mas alto introducido es " + num3);
			}
		}
	}

}
