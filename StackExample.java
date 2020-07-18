package tech.codingclub;

import java.util.Date;
import java.util.Iterator;
import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        System.out.println("This is Rudra Dev Mishra");
        System.out.println("Running Stack example at  "+new Date().toString()+" sharp");

        Stack<Integer> stack = new Stack<Integer>();

        stack.push(2);
        stack.push(4);
        stack.push(10);
        stack.push(101);

        //Pop or remove
        int topElementPoped = stack.pop();

        System.out.println("Top Element : " + stack.peek() );

        int index = stack.search(5);
        int find200 = stack.search(200);

        System.out.println("Index  of 5 : " + index);
        System.out.println("Index  of 200 : " + find200);

        Iterator<Integer> iterator = stack.iterator();
        while(iterator.hasNext())
        {
            System.out.println("Iterator showing elemnent :" + iterator.next());
        }

        while(iterator.hasNext())
        {
            int m = stack.pop();
            System.out.println("Popped :" + m);
        }
        while(!stack.empty())
        {
            int m = stack.pop();
            System.out.println("Popped :" + m);
        }

    }
}
