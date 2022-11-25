package main.java.dao;

import java.util.List;
import main.java.domain.Produto;

public interface ProdutoDao {

  public Produto cadastrar(Produto produto);

  public void excluir(Produto produto);

  public List<Produto> buscarTodos();

  public Produto buscarPorId(Produto produto);
}