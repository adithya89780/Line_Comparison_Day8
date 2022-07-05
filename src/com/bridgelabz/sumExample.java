package com.bridgelabz;

public class sumExample {

    static void devide() {
        float a = 100;
        float b = 35;
        float devision = a / b;
        System.out.println("devision = " + devision);
    }

    static int sum(int a, int b) {
        int addition = a + b;
        return addition;
    }

    static int multy(int x, int y) {
        int multiplication = x * y;
        return multiplication;
    }

    public static int subs(int a, int b) {
        int substraction = a - b;
        return substraction;

    }

    public static void main(String[] args) {


        System.out.println("Hello World");

        devide();

        int result = sum(10, 20);
        System.out.println("addition =  " + result);

        int result1 = multy(9, 10);
        System.out.println("multiplication = " + result1);

        int result2 = subs(100, 50);
        System.out.println("substraction = " + result2);


        for (int k = 2; k < 10; k++) {
            System.out.println(k);
        }

        System.out.println("while");
        int s = 3;
        while (s < 10) {
            s++;
            System.out.println(s);
        }
    }
}
