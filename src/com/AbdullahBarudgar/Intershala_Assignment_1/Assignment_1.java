package com.AbdullahBarudgar.Intershala_Assignment_1;

import java.util.Scanner;
public class Assignment_1 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        /** 1. Write the code for user input
         • Initialise class Scanner
         • Ask for Student’s name and store it in String variable
         • Ask for Student’s age and store it in Integer variable
         • Ask for Student’s blood group and store it in String variable
         ——————————————
         Name: Sriyank Siddhartha
         Age: 25
         Blood Group: A+
         ——————————————
         Your group is RED
         ——————————————

         2. Once you have got all user inputs, it’s time to decide the group to which the student
         belongs to. Let's divide the students into three groups: RED, BLUE and YELLOW. A
         group for a student is decided based on his age.
         • RED: If the age of a student is greater than or equal to 20 then he belongs to RED
         group
         • BLUE: If the age of a student is greater than or equal to 15 but smaller than 20 then he
         belongs to BLUE group.
         • YELLOW: If the age of a student is greater than or equal to 10 but smaller than 15 then
         he belongs to YELLOW group
         You need to use IF-ELSE-IF Ladder statements to decide the group for the student
         based on his age.
         3. One you have got all the attributes such as name, age, blood group and group name,
         you need to print out the Student ID Card that should look similar the desired output.
    **/

      String group;
     System.out.print("Enter Student Name : ");
     String name = sc.nextLine();
        System.out.print("Enter Student Age : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Blood Group : ");
        String bloodGroup = sc.nextLine();

        if(age >=20){
        group ="RED";
        }

        else if(age >=20 && age <20) {
            group = "BLUE";
        }
        else if(age >=10 && age <15){
         group = "YELLOW";
        }
        else{
          group ="eligible for no group";
        }

        System.out.print("\n\nName : "+name+"\nAge : "+age+"\nBlood Group : "+bloodGroup+"\nYour Group is :"+group);
    }
}

