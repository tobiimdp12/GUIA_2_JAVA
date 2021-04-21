package com.company;

import java.text.DecimalFormat;

public class objetoRectangulo {
    /*
    *
1. Modele el objeto Rectángulo con sus propiedades, ancho y alto.
* Ambas con valor 1,0 por defecto.
*  Este objeto debe exponer los getters y setters necesarios.
* También debe contar con un método para calcular el área y perímetro del mismo.
*
*
* Ejecute las siguientes pruebas:
a. Inicializar un objeto Rectángulo estableciendo ancho y alto.
b. Imprimir por pantalla el alto y ancho.
c. Imprimir por pantalla el área y perímetro.
d. Modificar el alto y el ancho de la instancia.
e. Imprimir por pantalla nuevamente el cálculo del área y perímetro.
f. Inicializar un objeto Rectángulo con los valores por defecto y verificar
    * */
    private float ancho;
    private float alto;



    public objetoRectangulo(float ancho, float alto)
    {
        this.ancho=ancho;
        this.alto=alto;
    }
    /*
    public  EjercicioRectangulo()
    {
        this.ancho=1.0f;
        this.alto=1.0f;
    }
    */

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float calcularArea()
    {


        float area=this.ancho*this.alto;
        return area;
    }
    public float calcularPerimetro()
    {
        float perimetro=this.ancho*2+2*this.alto;
        return perimetro;
    }
}
