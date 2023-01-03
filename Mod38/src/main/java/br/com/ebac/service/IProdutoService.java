package br.com.ebac.service;

import br.com.ebac.domain.Produto;
import br.com.ebac.service.generic.IGenericService;
import java.util.List;

public interface IProdutoService extends IGenericService<Produto, String> {

  List<Produto> filtrarProdutos(String query);
}
