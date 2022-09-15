package MultiThreading;

public class Main {
    public static void main(String[] args){
        for (int i = 0; i < 5; i++) {
            Person person = new Person("Paulo");
            person.start();

            try {
                person.join();
            } catch (InterruptedException e) {

            }
        }


        //Extends Thread Class
//        for (int i = 0; i < 5; i++) {
//            MultiThread thread = new MultiThread(i);
//            thread.start();
//
//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//
//            }
//        }

        //Implements Runnable Interface
//        MultiThreadRunnable runnable = new MultiThreadRunnable(1);
//        Thread thread = new Thread(runnable);
//
//        thread.start();

    }
}
