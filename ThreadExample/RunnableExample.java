package tech.codingclub;

import java.util.Date;
import java.util.Scanner;

public class RunnableExample implements Runnable {

    private  String threadName;
    public int counter;
    private int waitTime;

    public RunnableExample(String threadName , int counter, int waitTime){
        this.threadName = threadName;
        this.counter = counter;
        this.waitTime = waitTime;
    }
    // we are overriding how run will gonna work !
    @Override
    public void run(){
        while (counter <1000) {
            counter++;
            try{
                Thread.sleep(waitTime);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(threadName + " : " + counter);
        }
    }
    public static void main(String[] args) {

        System.out.println("This is Rudra Dev Mishra");
        System.out.println("Running Runnable example at  "+new Date().toString()+" sharp");

        RunnableExample runnable1 = new RunnableExample("Thread_A",0, 500);
        RunnableExample runnable2 = new RunnableExample("Thread_B",500, 1000);
        RunnableExample runnable3 = new RunnableExample("Thread_C",500, 2000);

//        System.out.println(thread1.counter);
//        System.out.println(thread2.counter);
//        System.out.println(thread3.counter);

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        Thread thread3 = new Thread(runnable3);

        thread1.start();
        thread2.start();
        thread3.start();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

    }
}
