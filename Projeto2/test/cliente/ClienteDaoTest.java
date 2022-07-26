package cliente;

import cliente.dao.ClienteDao;
import cliente.dao.ClienteDaoImpl;
import cliente.domain.Cliente;
import cliente.domain.Endereco;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteDaoTest {
    ClienteDao clienteDao;
    Cliente cliente;

    public ClienteDaoTest() {
        this.clienteDao = new ClienteDaoImpl();
    }

    @BeforeEach
    void setup() {

        cliente = new Cliente("Carolina", "12312312312", "1199999999",
                new Endereco("Rua dos bobos", "S/N", "", "São Paulo", "SP"));

    }

    @Test
    @DisplayName("Deve retornar sucesso quando cadastrar um cliente com sucesso")
    void deveCadastrarUmClienteComSucesso() {
        boolean retorno = clienteDao.cadastrar(cliente);
        assertTrue(retorno);
    }

    @Test
    @DisplayName("Deve retornar 'cliente encontrado com sucesso' ao pesquisar o cliente")
    void deveEncontrarUmClienteComSucesso() {
        Cliente retorno = clienteDao.buscar(cliente.getCpf());
        assertEquals(cliente.toString(), retorno.toString());
    }

    @Test
    @DisplayName("Deve retornar cliente com dado atualizado")
    void deveAtualizarUmClienteComSucesso() {
        cliente.setNome("Sofia");
        clienteDao.atualizar(cliente);
        assertEquals("Sofia", cliente.getNome());
    }

    @Test
    @DisplayName("Deve retornar true quando deletar um cliente")
    void deveDeletarUmCliente() {
        clienteDao.deletar(cliente.getCpf());
        Cliente retorno = clienteDao.buscar(cliente.getCpf());
        assertNull(retorno);
    }

}
