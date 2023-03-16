package org.example.Synchronization;

public class SharedResource {
     synchronized void display(String str){

         for(int i=0;i<str.length();i++){
             System.out.print(str.charAt(i));
         }
         System.out.println();

    }
}

