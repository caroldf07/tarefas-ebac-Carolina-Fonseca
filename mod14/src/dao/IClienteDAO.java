package dao;

import domain.Cliente;
import java.util.Collection;

/** @author carolinafonseca Interface de Data Acess Object da classe Cliente */
public interface IClienteDAO {
  /**
   * @param cliente Recebe as informações do cliente que se deseja cadastrar
   * @return Verdadeiro caso tenha cadastrado com sucesso e falso caso tenha acontecido algum erro
   */
  Boolean cadastrar(Cliente cliente);

  /** @param cpf Recebe apenas o cpf do cliente que se deseja excluir dos registros */
  void excluir(Long cpf);

  /**
   * @param cliente Recebe apenas o cpf do cliente que se deseja alterar toda e qualquer informação
   */
  void alterar(Cliente cliente);

  /**
   * @param cpf Recebe apenas o cpf do cliente que se deseja consultar
   * @return Retorna o cliente especificado, caso ele existe no banco de dados
   */
  Cliente consultar(Long cpf);

  /** @return Retorna todos os clientes cadastrados no banco de dados */
  Collection<Cliente> buscarTodos();
}
