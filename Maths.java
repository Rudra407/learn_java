package tech.codingclub;

import java.util.Date;

public class Test5 {
    public static void main(String[] args) {

        System.out.println("This is Rudra Dev Mishra");
        System.out.println("Running Test5 at  "+new Date().toString()+" sharp");

        int a = 140;
        int b =20;

        System.out.println("Addition : "+(a+b));
        System.out.println("Substraction : "+(a-b));
        System.out.println("Multiplication :"+(a*b));
        System.out.println("Division : "+(a/b));
        System.out.println("Modulo : "+(a%b));

        double c = -20.20;
        double d =  Math.abs(c);
        System.out.println("Math.abs() : "+Math.abs(c));
        System.out.println("Math.ceil() : "+Math.ceil(d));
        System.out.println("Math.floor() : "+Math.floor(c));
        System.out.println("Math.max() : "+Math.max(2,3));
        System.out.println("Math.min() : "+Math.min(4,5));


        System.out.println("Math.random 0 to 1  : "+Math.random());
        int random = (int)(10 + Math.random()*90);
        System.out.println("Math.random 10 to 100  : "+random);

        System.out.println("Math.PI  : "+Math.PI);

        int e =100;
        System.out.println("Post Increment " + (e++));
        System.out.println("Pre Increment " + (++e));


        System.out.println("while loop");

        int i = 1;
        int ans = 1;
        while(i<=5)
        {
            ans = ans * i;
            i++;
        }

        System.out.println("5! using while loop :"+ ans);

          






    }
}
