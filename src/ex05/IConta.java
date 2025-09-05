package ex05;

public interface IConta {

    public float visualizarSaldo();

    public void depositar(float deposito);

    public void sacar(float saque);

    public void atualizar(float taxa);
}
