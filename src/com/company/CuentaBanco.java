package com.company;

public class CuentaBanco {
    /*
    * 4. Modele el objeto que representa la cuenta de un banco, con identificador, nombre
        y balance.
        * Considere los getters, setters y constructores necesarios.
        *
        * Tenga en cuenta los siguientes métodos.
        *
        a. El método crédito que representa un depósito de dinero en la cuenta. Este
        método debe devolver el balance luego de la operación.
        b. El método débito que representa una sustracción de dinero de la cuenta.
        Este método debe devolver el balance luego de la operación. Si el dinero en
        la cuenta no es suficiente para cubrir la sustracción, se debe imprimir por
        pantalla un aviso.
        c. Un método que imprima por pantalla las características del objeto.
        Realice las siguientes operaciones:
        1. Inicialice una cuenta con un monto inicial de 15000.
        2. Realice una operación de crédito de 2500.
        3. Realice una operación de compra de 1500.
        4. Realice una operación de compra de 30000.
        5. Imprima por pantalla los valores de la cuenta y verifique que el balance sea
        correcto.
    *
    * */
    private int indentificador;
    private String nombre;
    private int balance;

    public CuentaBanco(int identificador,String nombre,int balance)
    {
        this.indentificador=identificador;
        this.nombre=nombre;
        this.balance=balance;
    }

    public int Credito(int deposito)
    {
        return balance+deposito;
    }

    public int Debito(int cantAretirar)
    {
        if(balance<cantAretirar)
        {
            System.out.println("Alto ahi vaquero usted no tienen fondos suficientes");
        }else
        {
            System.out.println("Retirando fondos");
            balance-=cantAretirar;
        }
        return balance;
    }

    public void imprimirCuenta()
    {
        String cuenta = String.format(" identificacion->%d %n nombre->%s %n balance->%d",
                this.indentificador,this.nombre,this.balance);
        System.out.println(cuenta);

    }
    public int getIndentificador() {
        return indentificador;
    }

    public void setIndentificador(int indentificador) {
        this.indentificador = indentificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
