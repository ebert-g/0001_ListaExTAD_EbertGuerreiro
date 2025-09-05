package ex05;

public class Conta implements IConta {
    private String titular;
    private String numero;
    private float saldo;

    public Conta(String titular, String numero, float saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Conta{");
        sb.append("titular=").append(titular);
        sb.append(", numero=").append(numero);
        sb.append(", saldo=").append(saldo);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public float visualizarSaldo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visualizarSaldo'");
    }

    @Override
    public void depositar(float deposito) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'depositar'");
    }

    @Override
    public void sacar(float saque) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sacar'");
    }

    @Override
    public void atualizar(float taxa) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
    }

}
