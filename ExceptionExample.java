package tech.codingclub;

import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        int x = 100;
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        try {
            int ans = x / y;
            System.out.println(ans);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Hello ");

        try {
            int arr[] = {23,23,2333};
            System.out.println(arr[100]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Caught ");
        }
        catch (ArrayIndexOutOfBoundsException e)

        {
            System.out.println("Out of Index Error");
        }
        catch (Exception e)
        {
            System.out.println("Caught !" + e.getClass());
        }
        finally {
            System.out.println("Printing Finally");
        }
        System.out.println("Hello ");


    }
}
