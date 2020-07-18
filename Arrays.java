package tech.codingclub;

import java.util.Date;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        System.out.println("This is Rudra Dev Mishra");
        System.out.println("Running Test3 at  "+new Date().toString()+" sharp");

        int arr[] = {10,20,30,40};
        arr[3] = 80;
        System.out.println("Last value in array is "+arr[3]);

        int mArr[][] = {{1,2,3,4},{5,6,7,8}};

        System.out.println("Last value in 2D array is "+mArr[1][3]);

        Scanner scan = new Scanner(System.in);
        int a,b;
        System.out.println("Enter a : ");
        a =scan.nextInt();
        System.out.println("Enter b : ");
        b= scan.nextInt();
        System.out.println("a = "+a+" b = "+b);
    }
}
