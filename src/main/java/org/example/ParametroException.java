package org.example;

public class ParametroException extends Exception {
    static class ParametrosInvalidosException extends ParametroException {
        static String getMesssage() {
            return "O segundo parâmetro deve ser maior que o primeiro";
        }
    }

    static class ParametroTresInvalidoException extends ParametroException {
        static String getMesssage() {
            return "O segundo parâmetro deve ser menor que o 200";
        }
    }
}
