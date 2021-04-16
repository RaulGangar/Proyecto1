package com_elorrieta_metodos;

public class Utilidades {

	public static void main(String[] args) {

		saludar();
		saludar("Raul");
		saludar("Ander");
	}

	public static void saludar() {
		System.out.println("Hombreeee que pasa");
	}

	public static void saludar(String nombre) {
		System.out.println("Hombreeee que pasa " + nombre);
	}
}
