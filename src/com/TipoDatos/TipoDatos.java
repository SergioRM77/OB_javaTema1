package com.TipoDatos;

public class TipoDatos {
    public static void main(String[] args) {
        int dato1 = 12;
        double dato2 = 14.25;
        boolean dato3 = true;
        String dato4 = "esto es un texto";

        tipoInt(dato1);
        tipoDouble(dato2);
        tipoBool(dato3);
        tipoString(dato4);
    }

    public static  void  tipoInt(int dato){
        System.out.println(dato);
    }
    public static void  tipoDouble(double dato){
        System.out.println(dato);
    }
    public static void  tipoBool(boolean dato){
        System.out.println(dato);
    }
    public static void  tipoString(String dato){
        System.out.println(dato);
    }
}
