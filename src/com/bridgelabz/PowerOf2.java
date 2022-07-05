package com.bridgelabz;
public class PowerOf2 {
    public static void main(String[] args) {

        int num = 9;
        int number = 1;

        if (num > 31) {
            System.out.println("value of number should be less than 31");
            return ;
        }
        else {
            System.out.println(number);
            for (int j = 1; j <= num; j++) {
                number = number * 2;
                System.out.println(number);
            }
        }
    }
}

