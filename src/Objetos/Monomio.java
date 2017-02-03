package Objetos;

public class Monomio {
    private Integer coeficiente;
    private Integer exponente;

    public Monomio(Integer coeficiente, Integer exponente) {
        this.coeficiente = coeficiente;
        this.exponente = exponente;
    }

    public Integer getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(Integer coeficiente) {
        this.coeficiente = coeficiente;
    }

    public Integer getExponente() {
        return exponente;
    }

    public void setExponente(Integer exponente) {
        this.exponente = exponente;
    }

    @Override
    public String toString() {
        return coeficiente + " x " + exponente;
    }
    
    
}
