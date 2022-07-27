package cliente;

import static org.junit.jupiter.api.Assertions.*;

import cliente.dao.ClienteDao;
import cliente.domain.Cliente;
import cliente.domain.Endereco;
import cliente.mock.ClienteDaoMockImpl;
import cliente.service.ClienteService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ClienteServiceTest {

  ClienteDao clienteDaoMock;
  ClienteService clienteService;

  Cliente cliente;

  public ClienteServiceTest() {
    clienteDaoMock = new ClienteDaoMockImpl();
    clienteService = new ClienteService(clienteDaoMock);
  }

  @BeforeEach
  void setup() {
    cliente =
        new Cliente(
            "Carolina",
            "12312312312",
            "1199999999",
            new Endereco("Rua dos bobos", "S/N", "", "São Paulo", "SP"));
  }

  @Test
  @DisplayName("Deve retornar sucesso quando cadastrar um cliente com sucesso")
  void deveCadastrarUmClienteComSucesso() {

    boolean retorno = clienteService.cadastrar(cliente);

    assertTrue(retorno);
  }

  @Test
  @DisplayName("Deve retornar 'cliente encontrado com sucesso' ao pesquisar o cliente")
  void deveEncontrarUmClienteComSucesso() {

    Cliente retorno = clienteService.procurar(cliente.getCpf());

    assertEquals(cliente.toString(), retorno.toString());
  }

  @Test
  @DisplayName("Deve retornar cliente com dado atualizado")
  void deveAtualizarUmClienteComSucesso() {
    cliente.setNome("José");
    clienteService.atualizar(cliente);
    Cliente retorno = clienteService.procurar(cliente.getCpf());
    assertEquals("José", retorno.getNome());
  }

  @Test
  @DisplayName("Deve retornar true quando deletar um cliente")
  void deveDeletarUmClienteComSucesso() {
    clienteService.deletar(cliente.getCpf());
  }
}
