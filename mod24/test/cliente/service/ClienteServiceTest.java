package cliente.service;

import cliente.dao.ClienteDao;
import cliente.dao.IClienteDao;
import cliente.mock.ClienteDaoMock;
import org.junit.*;

/**
 * @author Carolina.Fonseca on 12/04/2022
 * @project tarefas-ebac-Carolina-Fonseca
 * Atividade do módulo 24 - TDD
 */
public class ClienteServiceTest {
    IClienteDao mockDao;
    IClienteDao dao;
    ClienteService clienteServiceMock;
    ClienteService clienteService;

    @Before
    public void setup() {
        dao = new ClienteDao();
        mockDao = new ClienteDaoMock();
        clienteServiceMock = new ClienteService(mockDao);
        clienteService = new ClienteService(dao);
    }

    @Test
    public void salvarTest() {
        String retorno = clienteServiceMock.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest() {
        String retorno = clienteService.salvar();
    }

    //TODO
    //Fazer métodos de buscar, excluir e atualizar

    @Test
    public void buscarTest() {
        String objeto = clienteServiceMock.buscar("1");
        Assert.assertEquals("Sucesso", objeto);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroAoBuscarTest() {
        String objeto = clienteService.buscar("1");
    }

    @Test
    public void excluirTest() {
        String objeto = clienteServiceMock.excluir("1");
        Assert.assertEquals("Sucesso", objeto);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroAoExcluirTest() {
        String objeto = clienteService.excluir("1");
    }

    @Test
    public void atualizarTest() {
        String objeto = clienteServiceMock.atualizar("1");
        Assert.assertEquals("Sucesso", objeto);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroAoAtualizarTest() {
        String objeto = clienteService.atualizar("1");
    }
}
