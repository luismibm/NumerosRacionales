public class Racional {

    private int numerador, denominador;

    public Racional() {
        this.numerador = 0;
        this.denominador = 1;
    }

    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public Racional suma(Racional r) {
        int num = this.numerador * r.denominador + r.numerador * this.denominador;
        int den = this.denominador * r.denominador;
        return new Racional(num, den);
    }

    public Racional resta(Racional r) {
        int num = this.numerador * r.denominador - r.numerador * this.denominador;
        int den = this.denominador * r.denominador;
        return new Racional(num, den);
    }

    public Racional multiplicacion(Racional r) {
        int num = this.numerador * r.numerador;
        int den = this.denominador * r.denominador;
        return new Racional(num, den);
    }

    public Racional division(Racional r) {
        int num = this.numerador * r.denominador;
        int den = this.denominador * r.numerador;
        return new Racional(num, den);
    }

    public String toString() {
        return this.numerador + "/" + this.denominador;
    }

}
