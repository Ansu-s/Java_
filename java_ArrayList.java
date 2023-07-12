package com.java.LinkedList;
import java.util.*;

public class java_ArrayList {
    public static void main(String[] args) {
        List<String> MyList1 = new ArrayList<>();
        MyList1.add(String.valueOf(500));
        MyList1.add(String.valueOf(600));
        MyList1.add(String.valueOf(700));
        MyList1.add(3, String.valueOf(43));
        System.out.println(MyList1);
      ArrayList<String> Mylist2 = new ArrayList<>(50);
      ArrayList<String> MyList3 = new ArrayList<>(50);
      MyList3.add("");
      Mylist2.add("Hello");
      Mylist2.add("java");

        System.out.println(Mylist2);
        MyList3.addAll(MyList1);
        MyList3.addAll(Mylist2);

        System.out.println(MyList3);
        MyList3.remove(2);

        MyList3.remove(String.valueOf("43"));
        MyList3.remove("Hello");
        System.out.println(MyList3);
        System.out.println(MyList3.contains("hellow"));
        System.out.println(MyList3.contains("700"));


        for(int i=0;i< MyList3.size();i++)
        {
            System.out.println("The elements are "+ MyList3.get(i));
        }

        for (String s : MyList3) {
            System.out.println("The elements are " + s);
        }
        for (String str: MyList3) {
            System.out.println(" For each loop" +str);




            // Iterator
            Iterator<String> myiterator = MyList3.iterator();
            while(myiterator.hasNext()) {
                System.out.println("MY ITERATOR" + myiterator.next());
            }

            // Lamda function
            MyList3.forEach((ex) -> System.out.println("list items are" + ex));


        }
    }
}
