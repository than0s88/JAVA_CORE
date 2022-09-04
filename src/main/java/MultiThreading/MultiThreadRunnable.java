package MultiThreading;

public class MultiThreadRunnable implements Runnable {

    private int threadNum;

    public MultiThreadRunnable(int threadNum){
        this.threadNum = threadNum;
    }
    @Override
    public void run (){
        for (int i = 1; i <=5; i++) {

            System.out.println("Thread Runnable Number: "+threadNum+ " printing: "+i);

            if (threadNum == 2 || threadNum == 1){
                throw new RuntimeException();
            }
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){

            }
        }


    }
}
