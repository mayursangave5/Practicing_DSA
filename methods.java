
import java.util.Scanner;
public class methods{
    public static void main(String[] args) {
        
    Scanner sc= new Scanner(System.in);
    System.out.println("enter a string:-");
    String s=sc.nextLine();
    System.out.println("*the length of string is:=  "+(s.length())+".");
    System.out.println("*get char at index      :-  "+(s.charAt(0))+".");
    System.out.println("*replace 'a' with 's'   :-"+(s.replace("a", "s")));
    System.out.println("*check substrings       :-"+(s.contains(s)));
    System.out.println("*ignoring cases         :-"+(s.equalsIgnoreCase("Mayur")));
    System.out.println("*ignoring cases         :- "+(s.equals("mayur")));

    System.out.println("*extract part of string  :-"+(s.substring(0, 3)));
    System.out.println("*upper case              :-"+(s.toUpperCase()));
    System.out.println("*lower case               :-"+(s.toLowerCase()));
    System.out.println("*indent                  :-"+(s.indent(1)));
    System.out.println("*strip                   :-"+(s.strip()));
    System.out.println("*trim                     :-"+(s.trim()));
    System.out.println("*strip                   :-"+(s.strip()));
    System.out.println("*extract part of string    :-"+(s.concat(s)));
    System.out.println("");

    System.out.println("*enter two numbers:-");
    double n1=sc.nextDouble();
    double n2=sc.nextDouble();
    System.out.println("*max f two numbers"+Math.max(n1,n2));
    System.out.println("*min of two numbers"+Math.min(n1,n2));
    System.out.println("*sqrt of n1:-"+Math.sqrt(n1));
    System.out.println("*sqrt of n2:-"+Math.sqrt(n2));
    
    

    }}