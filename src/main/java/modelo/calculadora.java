package modelo;
public class calculadora {
private double valorA;
private double valorB;
public calculadora(){
this(0.0,0.0);       
}
public calculadora(double valorA, double valorB) {
this.valorA = valorA;
this.valorB = valorB;
}

    public double getValorA() {
        return valorA;
    }

    public void setValorA(double valorA) {
        this.valorA = valorA;
    }

    public double getValorB() {
        return valorB;
    }

    public void setValorB(double valorB) {
        this.valorB = valorB;
    }
 public double getSoma() {
        return (getValorA() + getValorB());
    }

    /**
     * Realiza a subtração
     *
     * @return Um valor real.
     */
    public double getDiferenca() {
        return (getValorA() - getValorB());
    }

    /**
     * Realiza a multiplicação.
     *
     * @return Um valor real.
     */
    public double getProduto() {
        return (getValorA() * getValorB());
    }

    /**
     * Realiza a divisão.
     *
     * @return Um valor real.
     */
    public double getQuociente() {
        return (getValorA() / getValorB());

}
}
