package Objetos;

import Excepciones.ValoresDiferentesException;

public class Lista {

    private Nodo inicio;
    private Integer contador;

    public Lista() {
        inicio = null;
        contador = 0;
    }

    public void agregarMonomio(Monomio m) {
        Nodo nuevo = new Nodo(m);

        if (ListaVacia()) {
            inicio = nuevo;
        } else {
            Nodo aux = inicio;

            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }

    public void simplificar() {
        Nodo aux1 = inicio;
        Nodo aux2 = aux1.getSiguiente();

        while (aux2 != null) {
            if (aux1.getMonomio().getExponente() == aux2.getMonomio().getExponente()) {
                int coeficiente = Integer.parseInt(aux1.getMonomio().getCoeficiente()) + Integer.parseInt(aux2.getMonomio().getCoeficiente());
                aux1.getMonomio().setCoeficiente("" + coeficiente);
                aux2 = aux2.getSiguiente();
                aux1.setSiguiente(aux2);
            } else {
                aux1.setSiguiente(aux2);
                aux1 = aux2;
                aux2 = aux2.getSiguiente();
            }
        }
    }

    public void sumarPolinomios(Lista lista) {
        Lista nueva = new Lista();
        Nodo aux = inicio;
        Nodo aux2 = lista.inicio;

        while (aux != null) {
            Monomio n = aux.getMonomio();
            nueva.agregarMonomio(n);
            aux = aux.getSiguiente();
        }

        while (aux2 != null) {
            Monomio n = aux2.getMonomio();
            nueva.agregarMonomio(n);
            aux2 = aux2.getSiguiente();
        }

        nueva.ordenarPorExponente();
        nueva.simplificar();

        Nodo aux3 = nueva.inicio;

        while (aux3 != null) {
            Monomio n = aux3.getMonomio();

            Nodo nuevo = new Nodo(n);

            inicio = nuevo;

            Nodo aux5 = inicio;

            while (aux5.getSiguiente() != null) {
                aux5 = aux5.getSiguiente();
            }
            aux5.setSiguiente(nuevo);

            aux3 = aux3.getSiguiente();
        }
    }

    public void restarPolinomios(Lista lista) throws ValoresDiferentesException {
        Lista nueva = new Lista();
        Nodo aux = inicio;
        Nodo aux2 = lista.inicio;

        while (aux != null) {
            Monomio n = aux.getMonomio();
            nueva.agregarMonomio(n);
            aux = aux.getSiguiente();
        }

        while (aux2 != null) {
            Monomio n = aux2.getMonomio();
            Integer coeficiente = Integer.parseInt(n.getCoeficiente());
            nueva.agregarMonomio(new Monomio(("" + -coeficiente), n.getExponente()));
            aux2 = aux2.getSiguiente();
        }

        nueva.ordenarPorExponente();
        nueva.simplificar();
        nueva.recorrerLista();
    }

    public void ordenarPorExponente() {
        Nodo aux1 = inicio;
        Nodo aux2 = inicio;

        while (aux2 != null) {
            aux1 = aux2.getSiguiente();

            while (aux1 != null) {
                if (aux1.getMonomio().getExponente().compareTo(aux2.getMonomio().getExponente()) < 0) {
                    Monomio temporal = aux2.getMonomio();
                    aux2.setMonomio(aux1.getMonomio());
                    aux1.setMonomio(temporal);
                }
                aux1 = aux1.getSiguiente();
            }
            aux2 = aux2.getSiguiente();
        }
    }

    public void recorrerLista() {
        Nodo aux = inicio;
        while (aux != null) {
            System.out.println(aux.getMonomio());
            aux = aux.getSiguiente();
        }
    }

    private boolean ListaVacia() {
        return inicio == null;
    }

    public void sumarContador() {
        contador++;
    }

    public Integer totalElementos() {
        return contador;
    }

}
