
package Excepciones;

public class ValoresDiferentesException extends Exception {

    private String mensaje;

    public ValoresDiferentesException() {
    }

    public ValoresDiferentesException(String string) {
        super(string);
        mensaje = string;
    }
    
    public String getMensaje(){
        return mensaje;
    }
}
