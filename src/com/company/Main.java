package com.company;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        /*---------------ejercicio 1----------------------------------------------------------------------*/

        EjercicioRectangulo Rectangulo1 = new EjercicioRectangulo(2, 3);
        DecimalFormat dFormat=new DecimalFormat("#.");
        String BaseYaltura = String.format("El ancho es-> %s y el alto es->%s ",
                dFormat.format(Rectangulo1.getAncho()), dFormat.format(Rectangulo1.getAlto()));

        System.out.println(BaseYaltura);

        String AreaYperimetro = String.format("El area es-> %s y el perimetro es->%s",
                dFormat.format(Rectangulo1.calcularArea()), dFormat.format(Rectangulo1.calcularPerimetro()));

        System.out.println(AreaYperimetro);

        Rectangulo1.setAlto(1);
        Rectangulo1.setAncho(5);

         AreaYperimetro = String.format("El area es-> %s y el perimetro es->%s",
                dFormat.format(Rectangulo1.calcularArea()), dFormat.format(Rectangulo1.calcularPerimetro()));
        System.out.println(AreaYperimetro);
        /*--------------------------------------------------------------------------------------------*/
        EjercicioRectangulo Rectangulo2 = new EjercicioRectangulo(1.0f, 1.0f);

        String BaseYaltura2 = String.format("El ancho es-> %s y el alto es->%s ",
                dFormat.format(Rectangulo2.getAncho()), dFormat.format(Rectangulo2.getAlto()));
        System.out.println("dd"+BaseYaltura2);

        String AreaYperimetro2 = String.format("El area es-> %s y el perimetro es->%s",
                dFormat.format(Rectangulo2.calcularArea()), dFormat.format(Rectangulo2.calcularPerimetro()));
        System.out.println(AreaYperimetro2);


        /*---------------ejercicio 2----------------------------------------------------------------------*/

        EjercicioEmpleado Empleado1 = new EjercicioEmpleado
                (23456345, "Carlos", "Gutiérrez", 25000);
        EjercicioEmpleado Empleado2=new EjercicioEmpleado
                (34234123,"Ana","Sánchez",27500);

        Empleado1.imprimirEmpleado();
        Empleado2.imprimirEmpleado();

        Empleado1.aumentarSalario(0.15f);
        System.out.println("Su salario a sido aumentado  ");
        Empleado1.imprimirEmpleado();
        System.out.println("Su salario anual es :) ");
        System.out.println(Empleado1.salarioAnual()+"$");

        /*---------------ejercicio 3----------------------------------------------------------------------*/
        EjercicioItemVenta Item1=new EjercicioItemVenta(
                12345,"soy una maseta",2,14);

        double pTotal=Item1.calcularPrecioTotal();
        Item1.imprimirItem(pTotal);

        /*---------------ejercicio 4----------------------------------------------------------------------*/
        CuentaBanco cuenta1=new CuentaBanco(23,"Tobias",15000);
        cuenta1.Credito(2500);
        System.out.println("primera transaccion");
        cuenta1.Debito(1500);
        System.out.println("ultima transaccion");
        cuenta1.Debito(30000);

        System.out.println(cuenta1.getBalance());
        if(cuenta1.getBalance()>0)
        {
            cuenta1.imprimirCuenta();
        }else
        {
            System.out.println("usted se a quedado sin money");
        }

        /*---------------ejercicio 5----------------------------------------------------------------------*/
        EjercicioHora Hora1=new EjercicioHora();

        Hora1.imprimirHMS();
        EjercicioHora Hora2=new EjercicioHora();
        Hora2=Hora2.avanzar1Seg(Hora2);
        Hora2=Hora2.retroceder1Seg(Hora2);

        Hora2.imprimirHMS();
    }
}
