/**
 * @author carolinafonseca
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        PessoaJuridica pj =
                new PessoaJuridica("Empresa S/A", "Rua das empresas", "SP", "12345678912345");
        PessoaFisica pf = new PessoaFisica("Carol", "Rua das pessoas", "SP", "12345678901");
        System.out.println("Pessoa jurídica: " + pj);
        System.out.println("Pessoa física: " + pf);
    }
}
