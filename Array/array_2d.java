
import java.util.Scanner;

/*  1 2 3
    1 2 2 4
    1 2 2 4 5
 in 2d array*/

public class array_2d {
          public static void main(String[]args){
                System.out.println("enter No of rows");
                Scanner sc = new Scanner(System.in);
                int r=sc.nextInt();
                int [][]box= new int[r][];
                for(int i=0;i<r;i++){
                    System.out.println("enter No of colmn "+(i+1)+": ");
                    int c =sc.nextInt();
                    box[i]= new int[c];
                     for(int j=0;j<c;j++){
                            box[i][j]=sc.nextInt();

                     }
                }
          
           System.out.println("the elements are : ");
            for(int i=0;i<r;i++){
                     for(int j=0;j<box[i].length;j++){
                       System.out.print(box[i][j]);     
                     }
                     System.out.println("");
}
}
}