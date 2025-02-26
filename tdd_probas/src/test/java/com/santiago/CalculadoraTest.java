package com.santiago;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    public void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    public void testSumar() {
        assertEquals(5, calculadora.sumar(2, 3));
        assertEquals(-1, calculadora.sumar(-2, 1));
        assertEquals(0, calculadora.sumar(0, 0));
    }

    @Test
    public void testRestar() {
        assertEquals(1, calculadora.restar(3, 2));
        assertEquals(-3, calculadora.restar(-2, 1));
        assertEquals(0, calculadora.restar(0, 0));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(6, calculadora.multiplicar(2, 3));
        assertEquals(-2, calculadora.multiplicar(-2, 1));
        assertEquals(0, calculadora.multiplicar(0, 5));
    }

    @Test
    public void testDividir() {
        assertEquals(2.0, calculadora.dividir(6, 3));
        assertEquals(-2.0, calculadora.dividir(-6, 3));
        assertEquals(0.0, calculadora.dividir(0, 5));
    }

    @Test
    public void testDividirPorCero() {
        assertThrows(ArithmeticException.class, () -> {
            calculadora.dividir(1, 0);
        });
    }
}

