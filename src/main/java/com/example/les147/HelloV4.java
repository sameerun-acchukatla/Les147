package com.example.les147;

public class HelloV4 {

    public static void main(String[] args) {

        // TODO: als het getal negatief is moet automatish absolout waarde van
        // de getal bereken

        int x = 15;
        int y = -24;

        System.out.println("Math.abs(" + x + ")=" + Math.abs(x));
        System.out.println("Math.abs(" + y + ")=" + Math.abs(y));
        System.out.println(x + y);
        //System.out.println(sum(10,20));
    }
    public static  double sum(double n1,double n2){
        return  n1 + n2;
    }
}
