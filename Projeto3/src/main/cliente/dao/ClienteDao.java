package main.cliente.dao;

import java.sql.SQLException;
import java.util.List;
import main.cliente.domain.Cliente;

public interface ClienteDao {
  Integer cadastrar(Cliente cliente) throws SQLException;

  Integer atualizar(Cliente cliente) throws SQLException;

  Cliente buscar(String codigo) throws SQLException;

  List<Cliente> buscarTodos() throws SQLException;

  void excluir(Cliente cliente) throws SQLException;
}
