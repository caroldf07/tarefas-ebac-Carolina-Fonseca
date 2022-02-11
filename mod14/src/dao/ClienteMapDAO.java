package dao;

import domain.Cliente;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

/** @author carolinafonseca Classe de implementação Map da interface DAO do Cliente */
public class ClienteMapDAO implements IClienteDAO {
  private Map<Long, Cliente> map;

  /** Construtor baseado no TreeMap */
  public ClienteMapDAO() {
    map = new TreeMap<>();
  }

  /**
   * @param cliente Recebe as informações do cliente que se deseja cadastrar
   * @return Caso o cliente não seja encontrado no banco de dados, ele será cadastrado e retornará
   *     true, caso já conste no banco de dados, nada acontecerá no banco e retornará falso
   */
  @Override
  public Boolean cadastrar(Cliente cliente) {
    if (this.map.containsKey(cliente.getCpf())) {
      return false;
    }

    this.map.put(cliente.getCpf(), cliente);
    return true;
  }

  /** @param cpf Recebe apenas o cpf do cliente que se deseja excluir dos registros */
  @Override
  public void excluir(Long cpf) {
    Cliente clienteCadastrado = this.map.get(cpf);
    this.map.remove(clienteCadastrado.getCpf(), clienteCadastrado);
  }

  /**
   * @param cliente Recebe apenas o cpf do cliente que se deseja alterar toda e qualquer informação
   * @apiNote Por questão de segurança, não utilizamos os setters
   */
  @Override
  public void alterar(Cliente cliente) {
    this.excluir(cliente.getCpf());
    this.cadastrar(cliente);
  }

  /**
   * @param cpf Recebe apenas o cpf do cliente que se deseja consultar
   * @return Retorna o cliente solicitado caso ele exista no banco
   */
  @Override
  public Cliente consultar(Long cpf) {
    return this.map.get(cpf);
  }

  /** @return Retorna todos os clientes cadastrados no banco de dados */
  @Override
  public Collection<Cliente> buscarTodos() {
    return this.map.values();
  }
}
