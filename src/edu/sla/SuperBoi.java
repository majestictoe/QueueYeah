package edu.sla;

public class SuperBoi {
    private String[] queue = new String[100];
    private int hundreds = 0;
    SuperBoi(){
    }
    synchronized boolean put(int i){
        if (queue[i]==null) {
            String v = String.valueOf(i+hundreds);
            queue[i] = String.valueOf(i + hundreds);
//            System.out.println("Value "+v+" assigned to "+i);
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
