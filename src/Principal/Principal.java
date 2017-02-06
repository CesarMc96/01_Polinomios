
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
        
        Lista l2 = new Lista();
        l2.agregarMonomio(new Monomio("-5", "2"));
        l2.agregarMonomio(new Monomio("-1", "2"));
        l2.agregarMonomio(new Monomio("2", "1"));
        l2.agregarMonomio(new Monomio("-5", "1"));
        l2.agregarMonomio(new Monomio("-12", "2"));
        
        System.out.println("Lista 1");
        l.recorrerLista();
        System.out.println("**************");
        System.out.println("Lista Ordenada");
        l.ordenarPorExponente();
        l.recorrerLista();
        System.out.println("**************");
        System.out.println("Lista simplificada");
        l.simplificar();
        l.recorrerLista();
        System.out.println("**************");
        System.out.println("Suma de Listas");
        l.sumarPolinomios(l2);
        l.recorrerLista();
        System.out.println("**************");
        //System.out.println("Resta de listas");
//l.restarPolinomios(l2);

        //Pantalla p = new Pantalla();
    }
}
