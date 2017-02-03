
package Principal;

import Objetos.Lista;
import Objetos.Monomio;

public class Principal {
    public static void main(String[] args) {
        
        Lista l = new Lista();
        l.agregarMonomio(new Monomio(-5, 2));
        l.agregarMonomio(new Monomio(-1, 2));
        l.agregarMonomio(new Monomio(2, 1));
        l.agregarMonomio(new Monomio(-5, 1));
        l.agregarMonomio(new Monomio(-12, 2));
        
        l.recorrerLista();
        l.simplificar();
        l.recorrerLista();
    }
}
