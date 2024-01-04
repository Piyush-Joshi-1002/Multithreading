package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;

class Product{

    int pId;

    String pName;

    public int getpId() {
        return pId;
    }

    public String getpName() {
        return pName;
    }
}
class User {

    int id ;

    String name;

    List<Product> products;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public List<Product> getProducts() {
        return products;
    }
}
public class Main {
    //  w  w  w .j  a va  2s . c om
    public static void main(String[] args)  {

    }
}

class ThreadGroupDemo implements Runnable {
    public ThreadGroupDemo() {

        ThreadGroup pGroup = new ThreadGroup("Parent ThreadGroup");

        ThreadGroup cGroup = new ThreadGroup(pGroup, "Child ThreadGroup");

        Thread t1 = new Thread(pGroup, this);
        System.out.println("Starting " + t1.getName());
        t1.start();

        Thread t2 = new Thread(cGroup, this);
        System.out.println("Starting " + t2.getName());
        t2.start();
        System.out.println("Active Count " + pGroup.activeCount());
        Thread[] list = new Thread[pGroup.activeCount()];
        int count = pGroup.enumerate(list);
        for (int i = 0; i < count; i++) {
            System.out.println("Thread " + list[i].getName() + " found " + list[i].getThreadGroup());
        }
        System.out.println("This is first change");
        System.out.println("This is second change");
    }

    // implements run()
    public void run() {
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Thread.currentThread().getName() +
                " finished executing.");
    }
}
