package DesafioControleFluxo;

public class ParametrosInvalidosExceptions extends Exception {
    
    private static final long serialVersionUID = 1L;

    public ParametrosInvalidosExceptions (String e) {
        super("O segundo parametro deve ser maior que o primeiro!");
    }

}
