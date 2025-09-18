package threeStrings;
//Write a program that asks the user for three strings.
//
//Then, print out whether the first string
//concatenated to the second string is equal to the
//third string. Here are a few sample program runs:
//
//Sample Program 1:
//
//First string? pepper
//Second string? mint
//Third string? peppermint
//pepper + mint is equal to peppermint!
//Sample Program 2:
//
//First string? go
//Second string? fish
//Third string? donuts
//go + fish is not equal to donuts!

import java.util.*;
public class ThreeStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First string? ");
        String string1 = sc.nextLine();
        System.out.print("Second string? ");
        String string2 = sc.nextLine();
        System.out.print("Third string? ");
        String string3 = sc.nextLine();
        String combinedString = string1+string2;
        if (combinedString.equals(string3)){
            System.out.println(string1 + " + " + string2 + " is equal to " + string3 +"!");
        } else {
            System.out.println(string1 + " + " + string2 + " is not equal to " + string3 +"!");
        }
    }
}
