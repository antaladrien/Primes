package com.antaladrien;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Primes between first and second number");
        System.out.println("Enter first number:");
        int num1 = myObj.nextInt();
        System.out.println("Enter second number:");
        int num2 = myObj.nextInt();

        int count = 0;
        for (int i = num1; i < num2; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if (count == 10) {
                    System.out.println("There are too many primes, enter a smaller interval");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n/2 ; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
