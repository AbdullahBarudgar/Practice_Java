package com.AbdullahBarudgar.Internshala_Assignment_2;

import java.util.Scanner;
public class Assignment_2 {

    public static void calculateTax(String name , long income ) {

        if (income >= 300000) {
            income += ((income * 20) / 100);
        } else if (income >= 100000) {
            income += ((income * 10) / 100);
        }

        System.out.println(name+"  :"+income);
    }


    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Tax Calculator App \n-----WELCOME------\n");

    System.out.println("Enter the person count :");
    int p= sc.nextInt();

    String [] name = new String[p];
    long [] income= new long[p];

        for(int i=0; i<p; i++ ){
            System.out.println("Enter Name :");
            sc.nextLine();
            name[i]=sc.nextLine();
            System.out.println("Enter Income :");
        income[i]=sc.nextLong();
        }

        System.out.println("\nNames with liable taxes");
        System.out.println("---------------------------");

        for (int i = 0; i < p; i++) {
            calculateTax(name[i], income[i]);
        }

    }
}

