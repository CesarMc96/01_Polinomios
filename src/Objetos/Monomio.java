package Objetos;

import Excepciones.ValoresDiferentesException;

public class Monomio {
    private String coeficiente;
    private String exponente;

    public Monomio(String coeficiente, String exponente) throws ValoresDiferentesException {
        this.coeficiente = coeficiente;
        this.exponente = exponente;
        validar();
    }
    
    public void validar() throws ValoresDiferentesException{
        if (!coeficiente.matches("[+-]?\\d*(\\.\\d+)?")) {
            throw new ValoresDiferentesException("Valor no numerico insertado");
        } else if (!exponente.matches("[+-]?\\d*(\\.\\d+)?")) {
            throw new ValoresDiferentesException("Valor no numerico insertado");
        }
    }

    public String getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(String coeficiente) {
        this.coeficiente = coeficiente;
    }

    public String getExponente() {
        return exponente;
    }

    public void setExponente(String exponente) {
        this.exponente = exponente;
    }

    @Override
    public String toString() {
        return coeficiente + " x " + exponente;
    }
    
}
