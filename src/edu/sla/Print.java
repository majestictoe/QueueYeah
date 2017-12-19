package edu.sla;

public class Print implements Runnable {
    SuperBoi theQueue;
    Print(SuperBoi queue){
        theQueue = queue;
    }
    public void run() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 100; j++) {
                while (!theQueue.get(j)) {
                    Thread.currentThread().yield();
                }
            }
        }
    }
}
