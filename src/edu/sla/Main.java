package edu.sla;

public class Main {
    static String[] myQueueYes;

    public static void main(String[] args) {
//        myQueueYes = new String[100];

//        Make MakeQueue = new Make(myQueueYes);
//        int hundreds = 0;
//        if (threads==1) {
//            for (int k = 0; k < 3; k++) {
//                //the run() method for Make
//                for (int i = 0; i < 100; i++) {
//                    myQueueYes[i] = String.valueOf(i + hundreds);
//                }
//                //the run() method for Print
//                for (int j = 0; j < 100; j++) {
//                    System.out.print(myQueueYes[j] + " ");
//                }
//                hundreds = hundreds + 100;
//            }
//        }
//        if(threads==2){
//            for(int k=0;k<3;k++){
//                MakeQueue.run();
//                Print PrintCurrent = new Print(MakeQueue.Orig);
//                PrintCurrent.run();
//                MakeQueue.hundreds = MakeQueue.hundreds+100;
//            }
//        }
//        if(threads ==3){
//            Make main = new Make(myQueueYes);
//            for (int k = 0; k < 3; k++) {
//                Runnable yeet = main;
//                Thread letsGo = new Thread(yeet);
//                letsGo.start();
//
//                Runnable woo = new Print(main.Orig);
//                Thread yes = new Thread(woo);
//                yes.start();
//                main.hundreds = main.hundreds+100;
//            }
//        }
        SuperBoi Queue = new SuperBoi();
        int threads = 4;
        if(threads==4){
            for (int k = 0; k < 3; k++) {
                Runnable yeet = new Make(Queue);
                Thread letsGo = new Thread(yeet);
                letsGo.start();

                Runnable woo = new Print(Queue);
                Thread yes = new Thread(woo);
                yes.start();
            }
        }
    }
}
