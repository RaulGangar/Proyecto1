package com.elorrieta.bd.pokemon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertarPokemon {

	public static void main(String[] args) {

		String sql = "INSERT INTO pokemon (nombre, numero, precio, brillante) VALUES (?, ?, ?, ?) ;";

		try (Scanner sc = new Scanner(System.in);
				Connection con = DriverManager.getConnection("jdbc:sqlite:pokemon.db");
				PreparedStatement pst = con.prepareStatement(sql)) {

			String salir = "";
			while (!"s".equalsIgnoreCase(salir)) {

				System.out.println("Inserta el nombre");
				String nombre = sc.nextLine();
				pst.setString(1, nombre);
				pst.executeUpdate();

				System.out.println("Inserta el numero");
				String numero = sc.nextLine();
				pst.setString(2, numero);
				pst.executeUpdate();

				System.out.println("Inserta el precio");
				int precio = sc.nextInt();
				pst.setInt(3, precio);
				pst.executeUpdate();

				System.out.println("Introduce 1 Si es brillante y 0 si no lo es");
				int brillante = sc.nextInt();
				pst.setInt(4, brillante);
				pst.executeUpdate();

				System.out.println("¿ quieres salir ? S-Si     N-No");
				salir = sc.nextLine();

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}// main

}