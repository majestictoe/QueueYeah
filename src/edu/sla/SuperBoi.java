package edu.sla;

public class SuperBoi {
    private String[] queue = new String[100];
    private int hundreds = 0;
    SuperBoi(){
    }
    synchronized int Hundreds(){return hundreds;}
    synchronized void put(int i){
        if (queue[i]==null) {
            //String v = String.valueOf(i+hundreds);
            queue[i] = String.valueOf(i + hundreds);
            //System.out.println("Value "+v+" assigned to "+i);
        }else{
            Thread.currentThread().yield();
        }
    }
    synchronized void get(int i){
        if(queue[i]!=null) {
            System.out.print(queue[i] + " ");
            queue[i]=null;
        }else{
            Thread.currentThread().yield();
        }
    }
    synchronized void changeHundreds(){
        hundreds = hundreds+100;
    }
}
