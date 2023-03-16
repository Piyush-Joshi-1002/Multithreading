package org.example.ThreadGroup;

// code that illustrates the activeCount() method

// import statement
import java.lang.*;


class ThreadNew extends Thread
{
    // constructor of the  class
    ThreadNew(){

    }
    ThreadNew(String tName, ThreadGroup tgrp)
    {
        super(tgrp, tName);
        start();
    }

    // overriding the run method
    public void run()
    {

        for (int j = 0; j < 1000; j++)
        {
            try
            {
                Thread.sleep(5);
            }
            catch (InterruptedException e)
            {
                System.out.println("The exception has been encountered " + e);
            }
        }
    }
}

public class ActiveCountExample
{
    // main method
    public static void main(String argvs[])
    {
        /*
        * activeCount()
        * activeGroupCount()
        * destroy()
        * enumerate(Thread[] list)
        * getMaxPriority()
        * getName()
        * interrupt()
        * isDaemon()
        * setDaemon(boolean daemon)
        * isDestroyed()
        * */
        ThreadGroup tg = new ThreadGroup("The parent group of threads");

        ThreadNew th1 = new ThreadNew("first", tg);
        //System.out.println("Starting the first" + th1.getThreadGroup());

        ThreadNew th2 = new ThreadNew("second", tg);
        //System.out.println("Starting the second");
        ThreadNew th3 = new ThreadNew();
        th3.setName("Madhur");

        System.out.println("The total number of active threads are: " );
        //tg.list();
        Thread [] t = new Thread[2];


        tg.enumerate(t);

    }
}
