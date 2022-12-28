import java.util.Scanner;

public class WhatMonth {
    public static void main(String[] args) {
        System.out.println("Введите номер месяца: ");
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        if (q > 2 && q < 13) {
            if (q > 2 && q < 6) {
                System.out.println("Весна");
            } else if (q > 5 && q < 9) {
                System.out.println("Лето");
            } else {
                System.out.println("Осень");
            }
        } else System.out.println("Зима");
    }
}
