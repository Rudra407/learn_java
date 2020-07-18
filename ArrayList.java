package tech.codingclub;

import java.util.ArrayList;
import java.util.Date;

public class Test7 {
    public static void main(String[] args) {
        System.out.println("This is Rudra Dev Mishra");
        System.out.println("Running Test7 at  "+new Date().toString()+" sharp");

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Welcome");
        arrayList.add("to");
        arrayList.add("the");
        arrayList.add("Java");
        arrayList.add("Code");
        arrayList.add("remove");

        String first = arrayList.get(0);
        System.out.println("First One :" + first);

        arrayList.set(2,"THE");
        int size = arrayList.size();

        arrayList.remove(size-1);

        for(int i=0;i<arrayList.size();i++)
        {
            System.out.println(arrayList.get(i));
        }

        arrayList.clear();
        System.out.println("size after clearing list :" + arrayList.size() );
    }
}
