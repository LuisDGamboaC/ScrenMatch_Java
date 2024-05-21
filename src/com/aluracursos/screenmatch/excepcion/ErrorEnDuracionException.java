package com.aluracursos.screenmatch.excepcion;

public class ErrorEnDuracionException extends RuntimeException { // en vews de throwable no necesitamos que nuestro titulo cheque una excepotion
    private String mensaje;
    public ErrorEnDuracionException(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage() {
        return this.mensaje;
    }
}
