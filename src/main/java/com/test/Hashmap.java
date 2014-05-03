package com.test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by aries on 3/18/14.
 */
public class Hashmap {

    public static void main(String[] args) {

        HashMap<String,String> map=new HashMap<String,String>();
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
        System.out.println(map.get("1"));
        System.out.println(map.hashCode());

        Map<String,String> table=new Hashtable();

    }

    static int hash(int h) {
        // This function ensures that hashCodes that differ only by
        // constant multiples at each bit position have a bounded
        // number of collisions (approximately 8 at default load factor).
        h ^= (h >>> 20) ^ (h >>> 12);
        return h ^ (h >>> 7) ^ (h >>> 4);
    }


}
