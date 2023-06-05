package com.softtek.pruebas_unitarias05_06.Herencia.Ejercicio1.Modelo;

public class Circulo extends Figura {
    private double radio;

    public Circulo(int x, int y, double r) {
        super(x, y);
        this.radio = r;
    }

    public static double obtenerArea(double radio) {
        return 3.14*(radio*radio);
    }
    public double getRadio() {
        return radio;
    }

    @Override
    public String posicion() {
        return super.posicion() + " Radio del círculo: " + radio;
    }
}
