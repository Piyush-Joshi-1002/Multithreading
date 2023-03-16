package org.example.Collections.Synchronized;

import java.util.*;

public class SynchronizedList {
    public static void main(String[] args) {
        List<String> list = Collections.synchronizedList(new ArrayList<>());
        list.add("Name");
        list.add("Adderse");
        list.add("Age");
        synchronized (list){
            for(String s : list){
                System.out.println(s );
            }
        }
        /*
         we use the synchronized keyword to synchronize on the synchronized list and iterate over its
         elements using a for loop. We then print each element to the console.
         By synchronizing on the synchronized list, we ensure that only one thread can access the list at a time,
         preventing concurrent modification and maintaining thread safety.
        */

        Map<Integer,Integer> map= Collections.synchronizedMap(new HashMap<>());

    }
}
