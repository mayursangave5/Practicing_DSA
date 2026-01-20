/*Question: Count Subarrays with Sum Divisible by K

Problem:

Given an array of n integers and an integer k, find and print the number of subarrays whose sum is divisible by k.

Input Format:

The first line contains two space-separated integers, n (size of the array) and k.

The second line contains n space-separated integers, the elements of the array.

Constraints:

1 ≤ n ≤ 10^3

-10^3 ≤ arr[i] ≤ 10^3

1 ≤ k ≤ 1000

Output Format:

Print a single integer — the number of subarrays whose sum is divisible by k.

Sample Input:

5 3
1 2 3 4 1


Sample Output:

4 */
//solution

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. . */
        Scanner sc=new Scanner(System.in);
        //System.out.println("enter lenth of array:=> ");
        int n=sc.nextInt();
        int[]a=new int[n];
        //System.out.println("enter elements of array:=> ");
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int count=0;
        for (int s=0;s<n;s++){
            int sum=0;
            for(int e=s;e<n;e++){
                sum=sum+a[e];
                if(sum<0){
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}