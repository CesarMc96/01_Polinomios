package Objetos;

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
        Nodo aux = inicio;
        int coeficientenuevo = 0;
        
        
        for (int i = 0; i < 100; i++) {
            if (i == aux.getMonomio().getExponente()) {
                while (aux != null) {
                    coeficientenuevo = aux.getMonomio().getCoeficiente() + coeficientenuevo;
                    aux = aux.getSiguiente();
                }
                Nodo nuevo = new Nodo(new Monomio(coeficientenuevo, i));
            }
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
