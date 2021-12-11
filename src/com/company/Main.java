package com.company;
import java.util.Scanner;
import java.lang.Math;
public class Main {
    static int reversDigits(int value) {
        if(value < 1) {
            return 0;
        }
        int temp = value % 10;
        value = (value - temp)/10;
        System.out.print(temp);
        return reversDigits(value);
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");

        int value = input.nextInt();
        System.out.print("Число в обратном порядке: ");
        reversDigits(value);
    }
}
