package com.company;

import java.text.DecimalFormat;

public class EjercicioItemVenta {

    /*
    * 3. Modele el objeto Ítem de Venta con las siguientes propiedades, identificador,
    descripción, cantidad y precio unitario.

    * Cree los métodos para calcular el precio total teniendo en cuenta el precio unitario y cantidad.
    *
    *Un método que permita imprimir por pantalla los atributos del objeto de la siguiente forma:
    *
    ItemVenta[id=?, descripción=?, cantidad=?, pUnitario=?, pTotal=?]
    a. Inicialice el objeto con los atributos necesarios
    b. Imprima por pantalla el objeto inicializado.
    *
    * */
    private int Identificador;
    public  String Descripcion;
    public  int Cantidad;
    public  double precioUnitario;

    public EjercicioItemVenta(int Identificador,String Descripcion,int Cantidad,double precioUnitario)
    {
        this.Identificador=Identificador;
        this.Descripcion=Descripcion;
        this.Cantidad=Cantidad;
        this.precioUnitario=precioUnitario;

    }

    public double calcularPrecioTotal()
    {
        return Math.round(precioUnitario*Cantidad);
    }
    public void imprimirItem(double pTotal)
    {

        DecimalFormat dFormat=new DecimalFormat("#.#");
        //para los double hay que usar %f
        String itemPrint = String.format("ItemVenta[id=%d, descripción=%s,pUnitario=%s,Total=%s]",
                //                                         .format retorna un string
                this.Identificador,this.Descripcion,dFormat.format(this.precioUnitario),dFormat.format(pTotal));

        System.out.println(itemPrint);


    }

}
