package com.santiago;

import java.util.regex.Pattern;

public class ValidadorContraseña {
    
    private static final Pattern LONGITUD = Pattern.compile("^.{8,}$");
    private static final Pattern MAYUSCULA = Pattern.compile(".*[A-Z].*");
    private static final Pattern MINUSCULA = Pattern.compile(".*[a-z].*");
    private static final Pattern NUMERO = Pattern.compile(".*[0-9].*");
    private static final Pattern CARACTER_ESPECIAL = Pattern.compile(".*[!@#$%^&*].*");

    public boolean esValida(String contraseña) {
        return LONGITUD.matcher(contraseña).matches() &&
               MAYUSCULA.matcher(contraseña).matches() &&
               MINUSCULA.matcher(contraseña).matches() &&
               NUMERO.matcher(contraseña).matches() &&
               CARACTER_ESPECIAL.matcher(contraseña).matches();
    }
}