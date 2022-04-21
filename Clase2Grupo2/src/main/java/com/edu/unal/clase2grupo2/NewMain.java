/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unal.clase2grupo2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float a;
        float b;

        float res;
        Scanner teclado = new Scanner(System.in);

        System.out.println("digite el valor de a: ");
        a = teclado.nextFloat();
        System.out.println("digite el valor de b: ");
        b = teclado.nextFloat();

        res = a + b;
        System.out.println("suma: " + res);

        res = a - b;
        System.out.println("resta: " + res);

        res = a * b;
        System.out.println("multiplicacion: " + res);
        res = a / b;
        System.out.println("division: " + res);
        res = a % b;
        System.out.println("modulo residuo: " + res);

        a += 10;
        System.out.println("a:" + a);
        a -= 10;
        System.out.println("a:" + a);
        a *= 10;
        System.out.println("a:" + a);
        a /= 10;
        System.out.println("a:" + a);
        a %= 10;
        System.out.println("a:" + a);

        int x = 10;
        int y = x;

        System.out.println("x= " + (x++));
        System.out.println("y= " + (++y));

        System.out.println("x=" + x + "   y=" + y);

        float m1 = 1, m2 = 2, r = 3;

        double F = 6.67384e-11 * m1 * m2 / (r * r);

        double x1 = 1.0;
        double y1 = -2.5;
        int n1 = (int) x1;
        int M1 = (int) y1;
        int p1 = (int) 3.14159265;

    }

}
