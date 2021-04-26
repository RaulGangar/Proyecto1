package com.elorrieta.bd.pokemon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Pokemon {

	public static void main(String[] args) {

		try (Connection con = DriverManager.getConnection("jdbc:sqlite:pokemon.db");
				Statement st = con.createStatement();
				ResultSet rs = st
						.executeQuery("SELECT id, nombre, numero, precio, brillante FROM pokemon ORDER BY id ASC; ");

		) {

			while (rs.next()) {

				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				String numero = rs.getString("numero");
				int precio = rs.getInt("precio");
				int brillante = rs.getInt("brillante");

				System.out.println(id + " - " + nombre + " - " + numero + " - " + precio + " - " + brillante);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}// main
}