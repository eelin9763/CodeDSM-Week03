package edu.dmacc.coma510;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        double x = in.nextInt();
        System.out.println("Please enter second number: ");
        double y = in.nextInt();
        System.out.println("Please enter third number: ");
        double z = in.nextInt();
        System.out.println(String.format("The average is: %f", ((x + y + z) / 3)));

        in.close();

        double a = 5.3;
        double b = 3.1;
        double c = 8.0;
        double smallestNum = Math.min(a, Math.min(b,c));
        System.out.println(String.format("%.1f is the smallest number", smallestNum));

        double d = 3.0;
        double e = 1.0;
        double f = 0.9;
        double smallestNum2 = Math.min(d, Math.min(e,f));
        System.out.println(String.format("%.1f is the smallest number", smallestNum2));




    }


}
