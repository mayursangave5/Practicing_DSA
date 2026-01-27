
    import java.util.Scanner;

public class Ebill {
    public static void main(String[] args) {
        int units;
        double bill = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        units = sc.nextInt();

        if (units <= 100) {
            bill = units * 3.20;
        } 
        else if (units <= 200) {
            bill = (100 * 3.20) + (units - 100) * 6.50;
        } 
        else if (units <= 300) {
            bill = (100 * 3.20) + (100 * 6.50) + (units - 200) * 9.80;
        } 
        else {
            bill = (100 * 3.20) + (100 * 6.50) + (100 * 9.80) + (units - 300) * 13.25;
        }

        System.out.println("Electricity Bill = ₹" + bill);

        sc.close();
    }
}

    

