package com.test;

import java.util.*;

/**
 * Created by aries on 3/18/14.
 */
public class Treemap {

    public static void main(String[] args) {

        Map<String,String> map=new TreeMap<String, String>();
        map.put("1","1");
        map.put("2","1");

        for (int i=0;i<1000;i++){
            map.put(String.valueOf(i),String.valueOf(i));
        }

        Iterator<Map.Entry<String,String>> iterator=map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> entry= iterator.next();
            String key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+","+value);
            System.out.println(key.hashCode());
            System.out.println(entry.hashCode());
        }
        System.out.println(map.hashCode());


    }
}
