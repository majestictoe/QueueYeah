package edu.sla;

public class Make implements Runnable{
    SuperBoi theQueue;
    Make(SuperBoi queue){
        theQueue = queue;
    }
    public void run(){
        for (int i = 0; i < 100; i++) {
            theQueue.put(i);
        }

    }
}
