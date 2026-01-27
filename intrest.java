
/* 
 2. WAP to read the principal amount from the user and calculate the interest amount for the given period of time. (Consider gender and age of the person).
*/
import java.util.Scanner;

    public class intrest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double principal, time, interest, rate;
        int age;
        char gender;

        System.out.print("Enter principal amount: ");
        principal = sc.nextDouble();

        System.out.print("Enter time (in years): ");
        time = sc.nextDouble();

        System.out.print("Enter age: ");
        age = sc.nextInt();

        System.out.print("Enter gender (M/F): ");
        gender = sc.next().charAt(0);

        if (gender == 'M' || gender == 'm') {
            if (age >= 60)
                rate = 12;
            else
                rate = 10;
        } 
        else if (gender == 'F' || gender == 'f') {
            if (age >= 60)
                rate = 13;
            else
                rate = 11;
        } 
        else {
            System.out.println("Invalid gender input");
            return;
        }

        interest = (principal * rate * time) / 100;

        System.out.println("Rate of Interest: " + rate + "%");
        System.out.println("Interest Amount: " + interest);

        sc.close();
    }
}

    

