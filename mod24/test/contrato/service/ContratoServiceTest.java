package contrato.service;

import contrato.dao.ContratoDao;
import contrato.dao.IContratoDao;
import contrato.mock.ContratoDaoMock;
import org.junit.*;

/**
 * @author Carolina.Fonseca on 12/04/2022
 * @project tarefas-ebac-Carolina-Fonseca
 * Atividade do módulo 24 - TDD
 */
public class ContratoServiceTest {

    IContratoDao mockDao;
    IContratoDao dao;
    ContratoService contratoServiceMock;
    ContratoService contratoService;

    @Before
    public void setup() {
        dao = new ContratoDao();
        mockDao = new ContratoDaoMock();
        contratoServiceMock = new ContratoService(mockDao);
        contratoService = new ContratoService(dao);
    }

    @Test
    public void salvarTest() {
        String retorno = contratoServiceMock.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        String retorno = contratoService.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    //TODO
    //Fazer métodos de buscar, excluir e atualizar

    @Test
    public void buscarTest() {
        String objeto = contratoServiceMock.buscar("1");
        Assert.assertEquals("Sucesso", objeto);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroAoBuscarTest() {
        String objeto = contratoService.buscar("1");
    }

    @Test
    public void excluirTest() {
        String objeto = contratoServiceMock.excluir("1");
        Assert.assertEquals("Sucesso", objeto);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroAoExcluirTest() {
        String objeto = contratoService.excluir("1");
    }

    @Test
    public void atualizarTest() {
        String objeto = contratoServiceMock.atualizar("1");
        Assert.assertEquals("Sucesso", objeto);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroAoAtualizarTest() {
        String objeto = contratoService.atualizar("1");
    }
}
