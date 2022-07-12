package cliente;

import cliente.dao.ClienteDao;
import cliente.dao.ClienteDaoImpl;
import cliente.domain.Cliente;
import cliente.domain.Endereco;
import cliente.mock.ClienteDaoMockImpl;
import cliente.service.ClienteService;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteServiceTest {

    ClienteDao clienteDao;
    ClienteDao clienteDaoMock;
    ClienteService clienteService;
    ClienteService clienteServiceMock;
    Cliente cliente;

    public ClienteServiceTest() {
        clienteDao = new ClienteDaoImpl();
        clienteDaoMock = new ClienteDaoMockImpl();
        clienteService = new ClienteService(clienteDao);
        clienteServiceMock = new ClienteService(clienteDaoMock);
    }

    @BeforeEach
    void setup() {
        cliente = new Cliente("Carolina", "12312312312", "1199999999",
                              new Endereco("Rua dos bobos", "S/N", "", "São Paulo", "SP"));
    }

    @Test
    @DisplayName("Deve retornar sucesso quando cadastrar um cliente com sucesso")
    void deveCadastrarUmClienteComSucesso() {

        String retorno = clienteServiceMock.cadastrar(cliente);

        assertEquals("Cliente cadastrado com sucesso", retorno);
    }

    @Test
    @DisplayName("Deve retornar uma exception quando tentar cadastrar um cliente")
    void naoDeveCadastraUmCliente() {
        RuntimeException exception = assertThrows(UnsupportedOperationException.class,
                                                  () -> clienteService.cadastrar(cliente));
        assertEquals("Não pode realizar operação sem o banco cadastrado", exception.getMessage());
    }

    @Test
    @DisplayName("Deve retornar 'cliente encontrado com sucesso' ao pesquisar o cliente")
    void deveEncontrarUmClienteComSucesso() {

        Cliente retorno = clienteServiceMock.procurar(cliente.getCpf());

        assertEquals(cliente.toString(), retorno.toString());
    }

    @Test
    @DisplayName("Deve retornar uma exception quando tentar encontrar uma cliente")
    void naoDeveEncontrarUmCliente() {
        RuntimeException exception = assertThrows(UnsupportedOperationException.class,
                                                  () -> clienteService.procurar(cliente.getCpf()));
        assertEquals("Não pode realizar operação sem o banco cadastrado", exception.getMessage());
    }

    @Test
    @DisplayName("Deve retornar cliente com dado atualizado")
    void deveAtualizarUmClienteComSucesso() {
        String retorno = clienteServiceMock.atualizar(cliente.getCpf());
        assertEquals("Cliente atualizado com sucesso", retorno);
    }

    @Test
    @DisplayName("Deve retornar uma exception quando tentar atualizar um cliente")
    void naoDeveAtualizarUmCliente() {
        RuntimeException exception = assertThrows(UnsupportedOperationException.class,
                                                  () -> clienteService.atualizar(cliente.getCpf()));
        assertEquals("Não pode realizar operação sem o banco cadastrado", exception.getMessage());
    }

    @Test
    @DisplayName("Deve retornar true quando deletar um cliente")
    void deveDeletarUmClienteComSucesso() {
        boolean retorno = clienteServiceMock.deletar(cliente.getCpf());

        assertTrue(retorno);
    }

    @Test
    @DisplayName("Deve retornar uma exception quando tentar deletar um cliente")
    void naoDeveDeletarUmCliente() {
        RuntimeException exception = assertThrows(UnsupportedOperationException.class,
                                                  () -> clienteService.deletar(cliente.getCpf()));
        assertEquals("Não pode realizar operação sem o banco cadastrado", exception.getMessage());
    }
}