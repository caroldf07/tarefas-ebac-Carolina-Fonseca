package dao.generic.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

  private static Connection connection;

  private ConnectionFactory(Connection connection) {}

  public static Connection getConnection() {
    if (connection == null) {
      connection = initConnection();
    }
    return connection;
  }

  private static Connection initConnection() {
    try {
      return DriverManager.getConnection(
          "jdbc:postgresql://localhost15432/vendas", "postgres", "postgres");
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
}
