package com.java.LinkedList;

import java.util.HashMap;
import java.util.Map;

public class hashMapObject {
    public static void main(String[] args) {


        Map<String, hashMapCustomObject> mymap = new HashMap<String, hashMapCustomObject>();
        mymap.put("ram",new hashMapCustomObject ("a","b"));
        mymap.put("sita",new hashMapCustomObject ("c","d"));
        mymap.put("hari",new hashMapCustomObject ("e","f"));

        System.out.println(mymap.values());
    }

}
