package com.java.LinkedList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class HashMaps {
    public static void main(String[] args) {


        Map<Integer,String> hsm = new HashMap<>();
        hsm.put(2,"ram");
        hsm.put(3,"sita");
        hsm.put(4,"gopal");
        hsm.put(5,"ramya");
        hsm.put( null,"gopal");
        hsm.put(6,null);
        hsm.put(7,"shyam");

        System.out.println(hsm);
        System.out.println(hsm.size());

  String a= hsm.get(3);
        System.out.println(a);

        hsm.remove(6);
        System.out.println(hsm);

        Set<Integer> keys =  hsm.keySet();
        System.out.println(keys);

       Collection<String> valuePair= hsm.values();
        System.out.println(valuePair);


        for (Map.Entry<Integer,String> exp : hsm.entrySet())
        {
            System.out.println("key values ->"+ exp.getKey() + "The value ->"+exp.getValue());
        }
    }
}
