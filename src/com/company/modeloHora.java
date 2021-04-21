package com.company;
import java.util.Scanner;
public class modeloHora {

    /*
    * 5. Modele el objeto Hora, teniendo en cuenta sus atributos, hora, minuto y segundo.
        Tenga en cuenta el rango de valores aceptados para cada uno de estos.
        a. Hora: 0 … 23
        b. Minuto: 0 … 59
        c. Segundo: 0 … 59
        Considere el siguiente comportamiento:
        1. Un método que imprima la hora bajo el siguiente formato hh:mm:ss
        usando zero a la izquierda ejemplo 13:04:22 .
        2. Un método que avance en 1 segundo y devuelva la instancia del objeto.
        3. Un método que retroceda en 1 segundo y devuelva la instancia del objeto.
        4. Instanciar el objeto y probar los métodos creados.
    *
    * */
    private int hora;
    private int minuto;
    private int segundo;



    public modeloHora()
    {
        do {
            System.out.println("INGRESE UNA HORA");
            Scanner horaInput=new Scanner(System.in);
            this.hora=horaInput.nextInt();
            if(this.hora<0 || this.hora>23)
            {
                System.out.println("usted a ingresado una hora incorrecta intentelo de nuevo");
            }
        }while (this.hora<0 || this.hora>23);

        do {
            System.out.println("INGRESE UNA CANTIDAD DE MINUTOS");
            Scanner minutosInput=new Scanner(System.in);
            this.minuto=minutosInput.nextInt();
            if(this.minuto<0 || this.minuto>59)
            {
                System.out.println("usted a ingresado un minuto incorrecto intentelo de nuevo");
            }
        }while (this.minuto<0 || this.minuto>59);

        do {
            System.out.println("INGRESE UNA CANTIDAD DE SEGUNDOS");
            Scanner segundoInput=new Scanner(System.in);
            this.segundo=segundoInput.nextInt();
            if(this.segundo<0 || this.segundo>59)
            {
                System.out.println("usted a ingresado un segundo incorrecto intentelo de nuevo");
            }
        }while (this.segundo<0 || this.segundo>59);
    }

    //public void establecerHMS()
    //{


    //}
    public void imprimirHMS()
    {
        String newHora= null;
        String newMin = null;
        String newSeg = null;
        //1)compruebo si el tamaño de la hora minutos o segundos es igual a 1

        if(this.hora<10)//tiene una cifra
        {
             newHora="0"+this.hora;
        }else
        {
            newHora=Integer.toString(this.hora);
        }

        if(this.minuto<10)
        {
             newMin="0"+this.minuto;
        }else
        {
            newMin=Integer.toString(this.minuto);
        }

        if(this.segundo<10)
        {
             newSeg="0"+this.segundo;
        }else
        {
            newSeg=Integer.toString(this.segundo);
        }

        //paso de String->int



        String horario = String.format("[%s:%s:%s]",newHora, newMin,newSeg);
        System.out.println(horario);
    }

    public modeloHora avanzar1Seg(modeloHora instancia)
    {
        instancia.segundo+=1;
        return instancia;
    }

    public modeloHora retroceder1Seg(modeloHora instancia)
    {
        instancia.segundo-=1;
        return instancia;
    }


}
