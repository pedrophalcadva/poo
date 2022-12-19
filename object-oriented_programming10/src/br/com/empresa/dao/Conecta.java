package br.com.empresa.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conecta {

  public Connection getConecta() {
    Connection conn = null;
    try {
      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teste", "root", "");
      System.out.println("Conectado com sucesso");
    } catch (SQLException e) {
      System.err.println("Erro ao conectar");
    }
    return conn;
  }

}