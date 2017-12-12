package edu.sla;

public class Print implements Runnable {
    SuperBoi theQueue;
    Print(SuperBoi queue){
        theQueue = queue;
    }
    public void run(){
        for (int j = 0; j < 100; j++) {
                theQueue.get(j);
        }
        theQueue.changeHundreds();
    }
}
