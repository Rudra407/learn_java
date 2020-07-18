package tech.codingclub;

public class Singleton {

    public  int data;
//    public Singleton(){
//
//    }
//



    private static  Singleton singleton;

    private Singleton(int data){
        this.data = data;
        System.out.println("Constructor was called when data was : " + data);
    }

    public static Singleton getSingletonInstance(int data){
        if(singleton == null) {
            Singleton temp = new Singleton(data);
            singleton = temp;
            return temp;
        }
        else{
            return singleton;
        }
    }

}


/*
    //anaother way is here below
    private static final Singleton INSTANCE = new Singleton();
    private Singleton(){}

    public static  Singleton getInstance(){
        return INSTANCE;
    }
*/