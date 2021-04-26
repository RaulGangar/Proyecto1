package com.elorrieta.bd.pokemon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EliminarPokemon {

	public static void main(String[] args) {

		String sql = "DELETE FROM pokemon WHERE id = ? ;";

		try (Scanner sc = new Scanner(System.in);
				Connection con = DriverManager.getConnection("jdbc:sqlite:pokemon.db");
				PreparedStatement pst = con.prepareStatement(sql)) {

			System.out.println("Inserte el ID del Pokemon a eliminar:");
			int id = Integer.parseInt(sc.nextLine());
			pst.setInt(1, id);

			int filas = pst.executeUpdate();
			if (filas == 1) {
				System.out.println("Hemos eliminado " + filas + " filas");
			} else {
				System.out.println("Pokemon no encontrada");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}// main

}
