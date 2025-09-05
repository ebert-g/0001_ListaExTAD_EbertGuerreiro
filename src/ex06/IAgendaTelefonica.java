package ex06;

public interface IAgendaTelefonica {

    public void adicionar(Contato contato);

    public void excluir(Contato contato);

    public void atualizar(String nome, String numero);

    public void remover(Contato contato);
}
