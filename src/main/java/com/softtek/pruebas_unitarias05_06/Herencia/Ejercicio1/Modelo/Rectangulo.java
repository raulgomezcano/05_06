package com.softtek.pruebas_unitarias05_06.Herencia.Ejercicio1.Modelo;

public class Rectangulo extends Figura {
    private double ancho;
    private double alto;

    public Rectangulo(int x, int y, double a, double h) {
        super(x, y);
        this.ancho = a;
        this.alto = h;
    }

    public static double obtenerArea(double x, double y) {
        return x*y;
    }
    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    @Override
    public String posicion() {
        return super.posicion() + " Dimensiones del rectángulo: " + ancho + " x " + alto;
    }
}
