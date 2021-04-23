package com.elorrieta.primer.dia;

import java.util.Scanner;

public class NumeroMayor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num1;
		int num2;
		System.out.println("Introduce el primer numero");
		num1 = scan.nextInt();
		System.out.println("Introduce el segundo numero");
		num2 = scan.nextInt();

		if (num1 > 2) {
			System.out.println(num1);
		} else
			System.out.println(num2);

	}
}
