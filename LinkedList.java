package tech.codingclub;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

public class Test8 {
    public static void main(String[] args) {

        System.out.println("This is Rudra Dev Mishra");
        System.out.println("Running Test 8 at  "+new Date().toString()+" sharp");

        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("This");
        linkedList.add("is");
        linkedList.add("how");
        linkedList.add("you");
        linkedList.add("code");
        linkedList.add("LinkedList");

        String first = linkedList.getFirst();
        String second= linkedList.getLast();
        System.out.println(first + " " + second + " : "+linkedList.size());

        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext())
        {
            String data = iterator.next();
            System.out.println(data);
}



    }
}
