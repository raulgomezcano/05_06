package com.softtek.pruebas_unitarias05_06.Herencia.Ejercicio1.Modelo;

public class Calculadora {
    public static double sumar(double x, double y) {
        return x+y;
    }
    public static double restar(double x, double y) {
        return x-y;
    }
    public static double multiplicar(double x, double y) {
        return x*y;
    }
    public static double division(double x, double y) throws Exception {
        if (y == 0) {
            throw new Exception("Invalido , división entre cero");
        }
        return x / y;
    }
}
