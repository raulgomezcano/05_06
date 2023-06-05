package com.softtek.pruebas_unitarias05_06;

import com.softtek.pruebas_unitarias05_06.Herencia.Ejercicio1.Modelo.Calculadora;
import com.softtek.pruebas_unitarias05_06.Herencia.Ejercicio1.Modelo.Circulo;
import com.softtek.pruebas_unitarias05_06.Herencia.Ejercicio1.Modelo.Rectangulo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Test
    void contextLoads() throws Exception {
        double resultadoSuma = Calculadora.sumar(2,3);
        Assertions.assertEquals(5,resultadoSuma);
        double resultadoResta = Calculadora.restar(5,1);
        Assertions.assertEquals(4,resultadoResta);
        double resultadoMultiplica = Calculadora.multiplicar(2,3);
        Assertions.assertEquals(6,resultadoMultiplica);
        double resultadoDivide = Calculadora.division(6,3);
        Assertions.assertEquals(2,resultadoDivide);

        double areaRectangulo = Rectangulo.obtenerArea(3,4);
        Assertions.assertEquals(12,areaRectangulo);
        double areaCirculo = Circulo.obtenerArea(10);
        Assertions.assertEquals(314,areaCirculo);

    }

}
