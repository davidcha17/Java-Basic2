package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    /*
    In this section of the basics, I will be learning about Java's:
    Comparison Operators
    Logical Operators
    Conditional Statements
    Loops
    */

//        Comparison Operators
        int x = 1;
        int y = 1;
//        System.out.println(x == y);
//        System.out.println(x != y);
//        System.out.println(x <= y);
//        System.out.println(x > y);
    /*
    one equal operator is an assignment and two equal operator is a comparison for true and false (equality operator)
    */

//        Logical Operators
        int temperature = 75;
        boolean isWarm = temperature > 70 && temperature < 80;
//         looking at this expression from left to right, it will stay true until the comparison operators become false
//        System.out.println(isWarm);

        boolean greatCredit = false;
        boolean greatIncome = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = ((greatCredit || greatIncome) && !hasCriminalRecord);
//        System.out.println(isEligible);

    /*
    implementing real world rules, if the applicant has either great credit or great income AND has no criminal record
    then he/she is eligible for a loan.
    */

//        if statements
    /*
    If temp is greater than 30 then print "it is a hot day, drink plenty of water"
    Otherwise, if its between 20 and 30 then print "its a nice day"
    Otherwise, print "its cold"
    */
        int temp = 31;
        if (temp > 30) {
            System.out.println("It's a hot day, drink plenty of water!");
        } else if (temp >= 20) {
//            && temp <= 30 don't necessarily need to add the and conditional logic because the first conditional statement is already
//            indicating if temp is greater than 30
            System.out.println("It's a nice day");
        } else {
            System.out.println("It's briiiick");
        }
    /*
    We can take out some unnecessary code and make it like:
        if(temp > 30) {
            System.out.println("it's a hot day, drink plenty of water!");
        }
        else if(temp >= 20)
            System.out.println("it's a nice day");
        else
            System.out.println("it's briiiiick")
    */

    /*
    Improving conditional statements
    */
//        if the person's income is greater than 120_000 then change hasHighIncome to true

        int income = 120_000;
        boolean hasHighIncome = false;
        if (income > 100_000)
            hasHighIncome = true;
        else
            hasHighIncome = false;
//    One way to write a conditional statement, but it is not clean...to make it cleaner
        int income2 = 130_000;
        boolean hasHighIncome2 = (income2 > 100_000);
//        System.out.println(hasHighIncome2);
//        most simplest way to write a conditional statement for true or false

//        Ternary operator
        int income3 = 90_000;
        String className = income3 > 80_000 ? "First class" : "Economy";
//                          condition           true            false
//        System.out.println(className);

    /*
        Switch case: a better and cleaner way of utilizing conditional statements
        We have an conditional statement to check to see if the user logged in is either admin, moderator or guest
    */
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter role: ");
//        String role = scanner.next().trim();

//        if(role.equals("admin"))
//            System.out.println("You are an admin");
//        else if(role.equals("moderator"))
//            System.out.println("You are a moderator");
//        else
//            System.out.println("You are a guest");
//        System.out.println(role);
    /*
    This conditional example allows the user to compare the user's input. The .equals() is a method that compares the
    values. Before I tried using the comparison operator and from what I've read it compares if both items are
    in the same place in memory.
    */
//        switch(role) {
//            case "admin":
//                System.out.println("You are a admin");
//                break;
//            case "moderator":
//                System.out.println("You are a moderator");
//                break;
//            default:
//                System.out.println("You are a guest");
//        }
    /*
    In this were accepting a parameter called role, in the case that the argument contains "admin" we print: "You are a admin"
    and break that case and add another case for when the argument contains "moderator" we print: "You are a moderator"
    and break that case. Then we finally have a default case where it is anything but the other two cases.
    We can also use integers, short, bytes as case statements. If the value is 1 and the case is 1, do something.
    */


//        exercise FizzBuzz
        /*
        if number is divisible by 5 return fizz, if number is divisible by 3 return buzz, if number is divisible by
        5 and 3 return fizzbuzz, if number is not divisible by 3 or 5 return the number.
        */

//        System.out.print("Enter number: ");
//        int number = scanner.nextInt();
//
//        if((number % 5 ==0) && (number % 3 ==0))
//            System.out.println("fizz buzz");
//        else if(number % 5 == 0)
//            System.out.println("fizz");
//        else if (number % 3 == 0)
//            System.out.println("buzz");
//        else
//            System.out.println(number);
    /*
    I tried using a switch case statement, but that proved to be difficult because it doesnt allow multiple expressions
    in the switch argument. You cant explicitly cast an int into a boolean :/
    */

//        For-loops
        for (int i = 0; i < 5; i++) {
//          loop counter | how many times it will be executed | incrementing the loop by 1
//            System.out.println("hello World® " + i);
//            we can decrement with for loops
        }
//      single statement such as this does not require the code block

//        While-loops
        int i = 3;
        while (i > 0) {
//            System.out.println("Bye Bye World " + i);
            i--;
        }
//        different way structure of utilizing loops

        String input = "";
//        while(input != "quit") {
//            THIS WONT WORK BECAUSE THE COMPARISON OPERATOR IS CHECKING TO SEE IF THEY ARE FORM THE SAME PLACE IN MEMORY
//            THE INPUT IS A REFERENCE TYPE (It will compare the address or a string's object NOT their value)
//        }
//        while(!input.equals("quit")) {
//            System.out.print("input: ");
//            input = scanner.next().toLowerCase();
//            System.out.println(input);
//        }
    /*
    Use while loops for when you don't know how many times you will be looping
    */

//        Do...While Loops

//        do {
//            System.out.print("input: ");
//            input = scanner.next().toLowerCase();
//            System.out.println(input);
//        } while(!input.equals("quit"));
    /*
    Same as a regular while loop, but the do..while loop will let it run at least once even if the statement is false
    It does something before it checks the conditional statement. More preferred to use a while loop than a do..while
    loop
    */

//        break and Continue
    /*
    The while loops can be trimmed better because when we type quit onto the terminal, it will print out quit again, and
    that is not okay.
    */
//        while(!input.equals("quit")) {
//            System.out.print("input: ");
//            input = scanner.next().toLowerCase();
//            if(!input.equals("quit"))
//                System.out.println(input);
//        put a conditional statement and say that if the input does NOT equal to quit, print the input
//        }
//    OR
//        while(true) {
////            we can use true because of the break statement, however if there was no break statement the loop will be
////            an infinite loop
//            System.out.print("input: ");
//            input = scanner.next().toLowerCase();
//            if(input.equals("pass"))
//                continue;
////            continue will repeat the loop and will not execute any of the codes below
//            if(input.equals("quit"))
//                break;
////            this break statement will stop the code when the input equals to quit
//            System.out.println(input);
//        }

//        for...each loop

        String [] fruits = {"Apples", "Banana", "Glizzy"};
//        we can iterate through the array of fruits with a simple for loop
        for(int j = 0; j < fruits.length; j++)
            System.out.println(fruits[j]);
//        OR
        for(String fruit : fruits) /* for each loop */
            System.out.println(fruit);
    /*
    For each though has some limitations:
            forwards only: we cant iterate the array from the end to the beginning
            Cannot access indexes, it only contains the value
    */


    }
}
