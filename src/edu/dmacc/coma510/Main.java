package edu.dmacc.coma510;

public class Main {

    public static void main(String[] args) {
        double a = 10;
        double b = 40;
        double c = 50;
        System.out.println(String.format("average of (%f, %f, %f) is: %f", a, b, c, avgOfThree(a, b, c)));

        double d = 1;
        double e = 1;
        double f = 7;
        System.out.println(String.format("average of (%f, %f, %f) is: %.1f", d, e, f, avgOfThree2(d, e, f)));

        double g = 5.3;
        double h = 3.1;
        double i = 8.0;
        System.out.println(String.format("smallest of (%f, %f, %f) is: %.1f", g, h, i, minOfThree(g, h, i)));

        double j = 3.0;
        double k = 1.0;
        double l = 0.9;
        System.out.println(String.format("smallest of (%f, %f, %f) is: %.1f", j, k, l, minOfThree2(j, k, l)));
    }

        public static double avgOfThree(double a, double b, double c) {
            return (a + b + c) / 3;
    }
        public static double avgOfThree2(double d, double e, double f) {
            return (d + e + f) / 3;
    }
        public static double minOfThree(double g, double h, double i) {
            return Math.min(Math.min(g, h), i);
    }
        public static double minOfThree2(double j, double k, double l) {
            return Math.min(Math.min(j, k), l);

    }
}
