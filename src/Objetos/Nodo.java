
package Objetos;

public class Nodo {
    private Monomio monomio;
    private Nodo siguiente;

    public Nodo(Monomio monomio) {
        this.monomio = monomio;
        siguiente = null;
    }

    public Monomio getMonomio() {
        return monomio;
    }

    public void setMonomio(Monomio monomio) {
        this.monomio = monomio;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
