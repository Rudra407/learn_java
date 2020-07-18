package tech.codingclub;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

public class Debugging {
//    public int correctSumFunction(int a, int b) {
//        int temp = a - b;
//        return temp;
//
//    }

    public static void main(String[] args) throws IOException {

        System.out.println("This is Rudra Dev Mishra");
        System.out.println("Debugging example at  "+new Date().toString()+" sharp");

        int N=10;
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum+=i;

        }

        Singleton singleton = Singleton.getSingletonInstance(456);
        System.out.println("Sum till m " + sum);
        System.out.println(new Date().toString());
        System.out.println(singleton.data + sum);

        int x = sum;
        int y = 50;
        int z = x + y ;
        System.out.println( z + " must be 100");


        BufferedReader br = new BufferedReader(new FileReader("/home/rudradevmishra/IdeaProjects/CodingClubBackend/src/main/java/tech/codingclub/StackExample.java"));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
            System.out.println(everything);
        } finally {
            br.close();
        }


    }
}
