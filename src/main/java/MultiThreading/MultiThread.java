package MultiThreading;

public class MultiThread extends Thread{
    private int threadNum;

    public MultiThread(int threadNum){
        this.threadNum = threadNum;
    }
    @Override
    public void run (){
        for (int i = 1; i <=5; i++) {

            System.out.println("Thread Number: "+threadNum+ " printing: "+i);

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
