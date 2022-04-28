package generic;

public interface GenericDao<T> {
    String cadastrar(T entity);

    T buscar(long chave);

    String atualizar(long chave);

    boolean deletar(long chave);
}
