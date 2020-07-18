package tech.codingclub;

import java.lang.reflect.Array;
import java.util.*;

public class SortExamples {
    public static void main(String[] args) {

        System.out.println("This is Rudra Dev Mishra");
        System.out.println("Set example at  "+new Date().toString()+" sharp");

        ArrayList<String> ar = new ArrayList<String>();
        ar.add("hr407@gmail.com");
        ar.add("rudramishra407@gmail.com");
        ar.add("mishrarudra407@gmail.com");
        ar.add("rudracourses407@gmail.com");
        ar.add("mishrarudra407@gmail.com");
        ar.add("rudracourses407@gmail.com");
        ar.add("hr@tikitok.com");
        ar.add("admin@tikitok.com");

        Collections.sort(ar);

        System.out.println("After Sorting : ");

        for(String element : ar)
        {
            System.out.println(element);
        }

        int arr[] = {2,5,1,7,6};

        Arrays.sort(arr);
        for(Integer element : arr)
        {
            System.out.println(element);
        }


    }
}
