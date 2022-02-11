import dao.ClienteMapDAO;
import dao.IClienteDAO;
import domain.Cliente;

import javax.swing.*;

/**
 * @author carolinafonseca
 * @version 1.0 Projeto 1 referente ao módulo 14 do curso de Especialista Java da EBAC
 */
public class Projeto1 {
    private static IClienteDAO iClienteDAO;

    /**
     * @param opcao Número digitado pelo usuário
     * @return retorna true caso o usuário digite de 1 a 5 e false caso seja alguma opção inválida
     */
    private static boolean isOpcaoValida(String opcao) {
        return opcao.equals("1") || opcao.equals("2") || opcao.equals("3") || opcao.equals("4") ||
                opcao.equals("5");
    }

    public static void main(String[] args) {
        iClienteDAO = new ClienteMapDAO();

        String opcao = JOptionPane.showInputDialog(null,
                "Digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração ou 5 para sair",
                "Green dinner", JOptionPane.INFORMATION_MESSAGE);

        while (!isOpcaoValida(opcao)) {
            if (opcao.equals("")) {
                sair();
            }
            opcao = JOptionPane.showInputDialog(null,
                    "Opção inválida! Digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração ou 5 para sair",
                    "Green dinner", JOptionPane.INFORMATION_MESSAGE);
        }

        while (isOpcaoValida(opcao)) {
            switch (opcao) {
                case "5":
                    sair();
                    break;
                case "4":
                    break;
                default:
                    String dados = JOptionPane.showInputDialog(null,
                            "Digite os dados do cliente separados por vírgula, conforme exemplo: Nome,CPF,Telefone,Endereço,Cidade,Estado",
                            "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                    cadastrar(dados);

            }
        }
    }

    private static void cadastrar(String dados) {
        String[] dadosSeparados = dados.split(",");
        Cliente cliente = new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5]);

        Boolean isCadastrado = iClienteDAO.cadastrar(cliente);

        if(isCadastrado){
            JOptionPane.showMessageDialog(null,"Cliente cadastrado com sucesso","Sucesso",JOptionPane.INFORMATION_MESSAGE);
        } else{
            JOptionPane.showMessageDialog(null,"Cliente foi cadastrado anteriormente","Erro",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void sair() {
        StringBuilder clientesCadastrados = new StringBuilder();
        for (Cliente cliente : iClienteDAO.buscarTodos()) {
            clientesCadastrados.append(cliente.toString()).append("\n");
        }

        JOptionPane.showMessageDialog(null, "Clientes cadastrados: " + clientesCadastrados);
        System.exit(0);
    }
}
