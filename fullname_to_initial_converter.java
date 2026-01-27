/*2. WAP that computes your initials from your full name and displays them. 
E.g. Name:     Sachin Ramesh Tendulkar
       Initials:    Tendulkar S. R.*/

import java.util.Scanner;

public class fullname_to_initial_converter {
    public static void main(String[] args) {
        
    Scanner sc= new Scanner(System.in);
    System.out.println("enter your Fullname as [first middle lastname]:- ");
    String s=sc.nextLine();
    String [] n= s.split(" ");
    System.out.println(n[2]+" "+n[0].toUpperCase().charAt(0)+" "+n[1].toUpperCase().charAt(0));
    
}}
