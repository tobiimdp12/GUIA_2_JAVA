package com.company;

import java.text.DecimalFormat;

public class EjercicioEmpleado {

    /*
    *2. Modele el objeto Empleado que posee las siguientes características, dni, nombre,
       apellido y salario.
       * El mismo debe contar con la posibilidad de calcular el salario
       anual.
       * A su vez se requiere otro método que permita aumentar el salario
       * dependiendo del porcentaje que se le pase por parámetro.
       * Considere crear un método que facilite imprimir por pantalla las características del objeto de la
       siguiente forma:
       Empleado[dni=?, nombre=?, apellido=?, salario=?]
       a. Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial de
       25000.
       b. Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de
       27500.
       c. Imprima ambos objetos por pantalla
       d. Aumente el salario del empleado Carlos en un 15% e imprima en pantalla el
       salario anual del mismo.

    *
    * */
    public int dni;
    public String nombre;
    public String apellido;
    public double salario;

    public EjercicioEmpleado(int dni,String nombre,String apellido,double salario)
    {
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
        this.salario=salario;

    }
    public double salarioAnual()
    {
        DecimalFormat dFormat=new DecimalFormat("#.00");

        double salarioA=this.salario;
        return Math.round(salarioA*12);
    }
    public void aumentarSalario(double porcentaje)
    {

        double salarioP=(this.salario*porcentaje)/100;//guardo la cantidad aumentada
        this.salario=salarioP+this.salario;//le sumo a salario el aumento
    }

    public void imprimirEmpleado()
    {
        DecimalFormat dFormat=new DecimalFormat("#.0");
    //para los double hay que usar %f
        String empleadoPrint = String.format("Empleado[dni= %d,nombre= %s,apellido= %s,salario= %s]"+"$",
                this.dni,this.nombre,this.apellido,dFormat.format(this.salario));

        System.out.println(empleadoPrint);


    }

}
