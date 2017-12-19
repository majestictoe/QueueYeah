package edu.sla;

public class Main {

    public static void main(String[] args) {
        SuperBoi Queue = new SuperBoi();
        int threads = 4;
        if(threads==4){
                Runnable gg = new Make(Queue);
                Thread aaaaa = new Thread(gg);
                aaaaa.start();
                Runnable yeet = new Make(Queue);
                Thread letsGo = new Thread(yeet);
                letsGo.start();

                Runnable woo = new Print(Queue);
                Thread yes = new Thread(woo);
                yes.start();
        }
    }
}
