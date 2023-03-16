package org.example.RunnableStopped;
 class RunnableStoped implements Runnable{
    static boolean stoppedThread = false;
    public synchronized void requestStoped(){
        stoppedThread = true;
    }
    public synchronized boolean isRequestedStoped(){
        return stoppedThread;
    }
    @Override
    public void run(){
        System.out.println("Thread Started");
        int i = 0;
        while(!this.stoppedThread){
            System.out.println("Thread is running :" + i++);
            try{
                Thread.sleep(100);
            }
            catch (Exception e){

            }
        }
        System.out.println("Thread Stopped");
    }


}
public class Main {
    public static void main(String[] args) {
        RunnableStoped runnableStoped = new RunnableStoped();
        Thread t1 = new Thread(runnableStoped);
        t1.start();
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        runnableStoped.requestStoped();
    }
}
