package ex04;

public class Racionais implements IRacionais {
    private int numerador;
    private int denominador;

    public Racionais(int denominador, int numerador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("O denominador nao pode ser 0");
        }
        this.denominador = denominador;
        this.numerador = numerador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    @Override
    public String toString() {
        return "Racionais [numerador=" + numerador + ", denominador=" + denominador + "]";
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    @Override
    public float somarRacionais(Racionais num) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'somarRacionais'");
    }

    @Override
    public float multiplicarRacionais(Racionais num) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'multiplicarRacionais'");
    }

    @Override
    public float testarIgualdade(Racionais num) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'testarIgualdade'");
    }

}
