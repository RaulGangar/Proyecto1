package com.elorrieta.bd.pokemon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ModPokemon {
	public static void main(String[] args) {

		String sql = "UPDATE pokemon SET name = ?, numero = ?, precio = ?, brillante = ?, WHERE id = ? ;";

		try (Scanner sc = new Scanner(System.in);
				Connection con = DriverManager.getConnection("jdbc:sqlite:pokemon.db");
				PreparedStatement pst = con.prepareStatement(sql)) {

			System.out.println("Inserte el ID del Pokemon a modificar:");
			int id = Integer.parseInt(sc.nextLine());

			System.out.println("Inserte el nombre nuevo:");
			String nombre = sc.nextLine();

			System.out.println("Inserte el numero nuevo:");
			String numero = sc.nextLine();

			System.out.println("Inserte el precio nuevo:");
			int precio = sc.nextInt();

			System.out.println("Inserte si es brillante o no;");
			int brillante = sc.nextInt();

			pst.setString(1, nombre);
			pst.setString(2, numero);
			pst.setInt(3, precio);
			pst.setInt(4, brillante);
			pst.setInt(5, id);

			int filas = pst.executeUpdate();
			if (filas == 1) {
				System.out.println("Persona modificada");
			} else {
				System.out.println("Persona NO modificada");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
