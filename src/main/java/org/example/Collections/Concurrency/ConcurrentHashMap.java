package org.example.Collections.Concurrency;

import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.*;
import java.util.Map;
public class ConcurrentHashMap {

    //better in efficiency -C_MAP
    public static void main(String[] args) {
        Map<Integer,Integer> s_map= Collections.synchronizedMap(new HashMap<>());
        ConcurrentMap<Integer,Integer> c_map = new java.util.concurrent.ConcurrentHashMap<>();

       // s_map.put(null,null);

       // c_map.get(null,null);



    }

}
