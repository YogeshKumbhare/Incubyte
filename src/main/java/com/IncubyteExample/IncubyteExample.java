package com.IncubyteExample;

import java.util.Scanner;

public class IncubyteExample {
    private static Scanner sc;

    public static void main(String[] args) {
        int year;
        sc = new Scanner(System.in);

        System.out.println("\n Please Enter any year : ");
        year = sc.nextInt();
        IncubyteExample e = new IncubyteExample();
        e.checkLeapYear(year);
    }

    public void checkLeapYear(int year) {
        if ( year % 4 == 0) {
            if (year%100 == 0) {
                if(year%400 == 0) {
                    System.out.format("\n %d is a Leap Year. \n", year);
                }
                else {
                    System.out.format("\n %d is NOT a Leap Year. \n", year);
                }
            }
            else {
                System.out.format("\n %d is a Leap Year. \n", year);
            }
        }
        else {
            System.out.format("\n %d is NOT a Leap Year. \n", year);
        }
    }
}