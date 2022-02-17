/**
 * @author carolinafonseca on 17/02/2022
 * @project tarefas-ebac-Carolina-Fonseca
 */
public class Client {

  private String gradeRequest;
  private boolean hasCompanyContract;

  public String getGradeRequest() {
    return gradeRequest;
  }

  public boolean isHasCompanyContract() {
    return hasCompanyContract;
  }

  /**
   * @param gradeRequest Grade da solicitação do cliente
   * @param hasCompanyContract Verificação se o cliente tem ou não o contrato com a empresa
   */
  public Client(String gradeRequest, boolean hasCompanyContract) {
    this.gradeRequest = gradeRequest;
    this.hasCompanyContract = hasCompanyContract;
  }
}
