package cliente;

import static org.junit.jupiter.api.Assertions.*;

import cliente.dao.ClienteDao;
import cliente.dao.ClienteDaoImpl;
import cliente.domain.Cliente;
import cliente.domain.Endereco;
import cliente.mock.ClienteDaoMockImpl;
import org.junit.jupiter.api.*;

public class ClienteDaoTest {
  ClienteDao clienteDao;
  ClienteDao clienteDaoMock;
  Cliente cliente;

  @BeforeEach
  void setup() {
    clienteDao = new ClienteDaoImpl();
    clienteDaoMock = new ClienteDaoMockImpl();

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
    String retorno = clienteDaoMock.cadastrar(cliente);
    assertEquals("Cliente cadastrado com sucesso", retorno);
  }

  @Test
  @DisplayName("Deve retornar uma exception quando tentar cadastrar um cliente")
  void naoDeveCadastrarUmCliente() {
    RuntimeException exception =
        assertThrows(UnsupportedOperationException.class, () -> clienteDao.cadastrar(cliente));
    assertEquals("Não pode realizar operação sem o banco cadastrado", exception.getMessage());
  }

  @Test
  @DisplayName("Deve retornar 'cliente encontrado com sucesso' ao pesquisar o cliente")
  void deveEncontrarUmClienteComSucesso() {
    Cliente retorno = clienteDaoMock.buscar(cliente.getCpf());
    assertEquals(cliente.toString(), retorno.toString());
  }

  @Test
  @DisplayName("Deve retornar uma exception quando tentar encontrar uma cliente")
  void naoDeveEncontrarUmCliente() {
    RuntimeException exception =
        assertThrows(
            UnsupportedOperationException.class, () -> clienteDao.buscar(cliente.getCpf()));
    assertEquals("Não pode realizar operação sem o banco cadastrado", exception.getMessage());
  }

  @Test
  @DisplayName("Deve retornar cliente com dado atualizado")
  void deveAtualizarUmClienteComSucesso() {
    String retorno = clienteDaoMock.atualizar(cliente.getCpf());
    assertEquals("Cliente atualizado com sucesso", retorno);
  }

  @Test
  @DisplayName("Deve retornar uma exception quando tentar atualizar um cliente")
  void naoDeveAtualizarUmCliente() {
    RuntimeException exception =
        assertThrows(
            UnsupportedOperationException.class, () -> clienteDao.atualizar(cliente.getCpf()));
    assertEquals("Não pode realizar operação sem o banco cadastrado", exception.getMessage());
  }

  @Test
  @DisplayName("Deve retornar true quando deletar um cliente")
  void deveDeletarUmCliente() {
    boolean retorno = clienteDaoMock.deletar(cliente.getCpf());
    assertTrue(retorno);
  }

  @Test
  @DisplayName("Deve retornar uma exception quando tentar atualizar um cliente")
  void naoDeveDeletarUmCliente() {
    RuntimeException exception =
        assertThrows(
            UnsupportedOperationException.class, () -> clienteDao.deletar(cliente.getCpf()));
    assertEquals("Não pode realizar operação sem o banco cadastrado", exception.getMessage());
  }
}
