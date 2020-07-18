package tech.codingclub;

import java.util.Date;
import java.util.Random;

public class Test6 {
    public static void main(String[] args) {

        System.out.println("This is Rudra Dev Mishra");
        System.out.println("Running Test6 at  "+new Date().toString()+" sharp");

        Random random = new Random();
        int randomIntValue = random.nextInt(100);

        System.out.println("randomIntValue : 0-99 "+ randomIntValue);

        int randomIntValueInRange = 50+ random.nextInt(50);
        System.out.println("randomIntValue : 50-99 "+ randomIntValueInRange);

        String string = "HelloWorld";
        System.out.println("Printing string " +string);
        string = string + "!";

        System.out.println("Printing Modified String " +string);

        System.out.println("string length" +string.length());

        System.out.println("Printing substring " +string.substring(5));

        System.out.println("Printing s ubstring 5th to 7th " +string.substring(5,7));

        System.out.println("Printing string to UpperCase " +string.toUpperCase());

        System.out.println("Printing string to LowerCase " +string.toLowerCase());

        int h = string.indexOf('W');
        System.out.printf("Index of W : "+h);

        char g = string.charAt(6);
        System.out.println("Printing char at 6th index " +string.charAt(6));

        String s1 = "abc";
        String s2 = "abd";

        System.out.println("comparing strings : " +s1.compareTo(s2));

        System.out.println("Current Time " +new Date().toString());


        Date date = new Date();

        long previoustEpochTime  = date.getTime();

        for(int i=0;i<1000000;i++)
        {

        }

        long currentEpochTime = new Date().getTime();

        System.out.println("Time elapsed to run 10^6 operations :"+(currentEpochTime - previoustEpochTime));

        Date dateFromEpoch = new Date(1584635277184L);
        System.out.println(dateFromEpoch);






    }
}
