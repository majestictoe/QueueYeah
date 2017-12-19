package edu.sla;

public class Make implements Runnable{
    SuperBoi theQueue;
    Make(SuperBoi queue){
        theQueue = queue;
    }
    public void run(){
      for (int j = 0; j<3; j++) {
          for (int i = 0; i < 100; i++) {
                  while (!theQueue.put(i)) {
                      Thread.currentThread().yield();

                  }
              if (i==99){
                      theQueue.changeHundreds();
              }
          }
      }
    }
}
