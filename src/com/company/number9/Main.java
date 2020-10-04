package com.company.number9;

import java.util.Scanner;

public class Main {

    public static int readInt(String name){
        System.out.printf("Enter the number '%s' ", name);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static double verifydelta(double a, double b, double c, double d, double e, double f) {
        double delta = a*e-b*d;
        return delta;

    }

    public static double findX(double a, double b, double c, double d, double e, double f) {
        double delta = a*e-b*d;
        double x = (c*e-b*f)/delta;
        return x;

    }

    public static double findY(double a, double b, double c, double d, double e, double f) {
        double delta = a*e-b*d;
        double y = (a*f-c*d)/delta;
        return y;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, e, f;
        a = readInt("a");
        b = readInt("b");
        c = readInt("c");
        d = readInt("d");
        e = readInt("e");
        f = readInt("f");
        double delta = verifydelta(a, b,c,d,e,f);
        if(delta==0){
            System.out.println("delta is equal 0");
        }else{
            System.out.println("delta is not equal 0");
        }
        double x = findX(a, b,c,d,e,f);
        double y = findY(a, b,c,d,e,f);
        System.out.println("x="+x+" y="+y);
    }

}