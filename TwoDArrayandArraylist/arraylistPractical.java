package TwoDArrayandArraylist;

import java.util.ArrayList;

public class arraylistPractical {
    public static void main(String[]args){
// Arraylist are dynamic in nature, so we don't have to specify it's size initially
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list);
        System.out.println(list.size());

        list.add(10);
        System.out.println(list);
        System.out.println(list.size());

        list.add(20);
        System.out.println(list);
        System.out.println(list.size());

        list.add(30);
        System.out.println(list);
        System.out.println(list.size());

       System.out.println( list.get(2));
       list.remove(2);
       System.out.println(list);
    }
}

