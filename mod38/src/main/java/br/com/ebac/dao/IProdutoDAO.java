package br.com.ebac.dao;

import br.com.ebac.dao.generic.IGenericDAO;
import br.com.ebac.domain.Produto;
import java.util.List;

public interface IProdutoDAO extends IGenericDAO<Produto, String> {

  List<Produto> filtrarProdutos(String query);
}
