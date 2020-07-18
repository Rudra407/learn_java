package tech.codingclub.utility;

import tech.codingclub.RunnableExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadManager {

//    private ExecutorService executorService;
//    private int poolSize;
//
//    public ThreadManager(int poolSize){
//        this.poolSize = poolSize;
//        executorService = Executors.newFixedThreadPool(this.poolSize)   ;
//    }
//
//    public void execute(Runnable runnable){
//        executorService.submit(runnable);
//    }

    public static void main(String[] args) {
       // ThreadManager threadManager = new ThreadManager(100);
        TaskManager taskManager = new TaskManager(100);
        for(int i=0;i<10000;i++){
           RunnableExample temp = new RunnableExample( "Thread No : " + i, 0, i);
            //threadManager.execute(temp);
            taskManager.waitTillQueueIsFreeAndAddTask(temp);
            // what if Queue is heavy u need to handle it

            System.out.println("$$$$$$$$$$$$$$$$$$ " + i);
        }
        System.out.println("###################################");
    }
}
