package edu.sla;

public class SuperBoi {
    private String[] queue = new String[100];
    private int hundreds = 0;
    private String makeWaiting = "no";
    private String printWaiting = "yes";
    SuperBoi(){
    }
    synchronized int Hundreds(){return hundreds;}
    synchronized String isMakeWaiting(){return makeWaiting;}
    synchronized String isPrintWaiting(){return printWaiting;}
    synchronized boolean put(int i){
        if (queue[i]==null) {
            String v = String.valueOf(i+hundreds);
            queue[i] = String.valueOf(i + hundreds);
//            System.out.println("Value "+v+" assigned to "+i);
            printWaiting = "no";
            if(i==100){
                hundreds = hundreds+100;
            }
            return true;
        }else{
            return false;
        }
    }
    synchronized boolean get(int i){
        if(queue[i]!=null) {
            System.out.print(queue[i] + " ");
            queue[i]=null;
            return true;
        }else{
            return false;
        }
    }
    synchronized void changeHundreds(){
        hundreds = hundreds+100;
    }
}
