package tech.codingclub;

public class SingletonExample {

    public static void main(String[] args) {

        Singleton obj1 = Singleton.getSingletonInstance(90);
        Singleton obj2 = Singleton.getSingletonInstance(56);
        obj1.data = 1234;
        obj2.data = 5678;

        //both output  = 56;
        System.out.println(obj1.data + " & " + obj2.data);
    }
}
