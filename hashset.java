package com.java.LinkedList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashset {
    public static void main(String[] args) {


        Set<String>  myhsh = new HashSet<>();
        myhsh.add("ram");
        myhsh.add("hari");
        myhsh.add("ramya");
        myhsh.add("sita");
        myhsh.add("ram");
        myhsh.add("sayam");

        Set<String> myhash2 = new HashSet<>(myhsh);
        System.out.println(myhash2);
        myhash2.add("mango");
        myhash2.remove("ramya");
        System.out.println(myhsh);
        System.out.println(myhash2);

       int a= myhash2.size();
        System.out.println("size is "+a + myhash2.size());
    //    myhash2.removeAll(myhsh);
        System.out.println(myhash2);

        for (String str : myhash2)
            System.out.println(str);


        for (Iterator<String> itr = myhash2.iterator(); itr.hasNext();){
            String strr =(String) itr.next();
            System.out.println(strr);


        }
    }
}
