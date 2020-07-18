package tech.codingclub;

import java.util.Date;

public class Test2 {

    public static void main(String[] args)
    {
        System.out.println("This is Rudra Dev Mishra");
        System.out.println("Running Test2 at  "+new Date().toString()+" sharp");
        int a = 400;
        int b = 8;
        int c = a+b;
        System.out.println("sum of a + b =" +c);

        double wideningVariable = a;
        System.out.println("WideningVariable = " +wideningVariable);

        wideningVariable = a + 0.1;
        System.out.println("WideningVariable = " +wideningVariable);

        int narrowingVariable = (int) wideningVariable;
        System.out.println("NarrowingVariable = " +narrowingVariable);

        int overflowVariable = Integer.MAX_VALUE;
        System.out.println("Max Value of Integer = " +overflowVariable);
        System.out.println("Min Value of Integer = " +Integer.MIN_VALUE);

        overflowVariable+=4;
        System.out.println("Modified Value of overflowVariable = " +overflowVariable);

    }
}
