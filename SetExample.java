package tech.codingclub;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {

        System.out.println("This is Rudra Dev Mishra");
        System.out.println("Set example at  "+new Date().toString()+" sharp");

        ArrayList<String> arr = new ArrayList<String>();
        arr.add("rudramishra407@gmail.com");
        arr.add("mishrarudra407@gmail.com");
        arr.add("rudracourses407@gmail.com");
        arr.add("mishrarudra407@gmail.com");
        arr.add("rudracourses407@gmail.com");
        arr.add("hr@tikitok.com");
        arr.add("admin@tikitok.com");

        ArrayList<String> blackListedEmails = new ArrayList<String>();
        blackListedEmails.add("admin@tikitok.com");
        blackListedEmails.add("hr@tikitok.com");


        System.out.println("Set Elements");
        Set<String> set = new HashSet<String>();
        set.add("hr407@gmail.com");
        set.addAll(arr);

        Iterator iter = set.iterator();
        while (iter.hasNext())
        {
            System.out.println("Iterator showing : "+ iter.next());
        }

        for(String x : set)
        {
            System.out.println("For loop showing : "+ x);
        }

        System.out.println("Size of set is : " + set.size());

        set.remove("hr407@gmail.com");
        set.removeAll(blackListedEmails);

        for(String x : set)
        {
            System.out.println("For loop showing : "+ x);
        }

        System.out.println("set contains rudramishra407@gmail.com id or not : "+ (set.contains("rudramishra407@gmail.com")));

        set.clear();
        System.out.println("set size after removing all : "+ set.size());


    }
}
