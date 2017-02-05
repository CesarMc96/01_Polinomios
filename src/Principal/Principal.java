
package Principal;

import Excepciones.ValoresDiferentesException;
import Objetos.Lista;
import Objetos.Monomio;
import Pantalla.Pantalla;

public class Principal {
    public static void main(String[] args) throws ValoresDiferentesException {
        
        Lista l = new Lista();
        l.agregarMonomio(new Monomio("-5", "2"));
        l.agregarMonomio(new Monomio("-1", "2"));
        l.agregarMonomio(new Monomio("2", "1"));
        l.agregarMonomio(new Monomio("-5", "1"));
        l.agregarMonomio(new Monomio("-12", "2"));
        
        l.recorrerLista();
        System.out.println("**************");
        l.ordenarPorExponente();
        l.recorrerLista();
        System.out.println("**************");
        l.simplificar();
        l.recorrerLista();

        Pantalla p = new Pantalla();
    }
}
