package com.unicorn.Collection;

import java.util.*;

public class Text {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст:");
        String enter=in.nextLine();
        String[] tex=enter.split(" ");
        ArrayList<String>text = new ArrayList<>(Arrays.asList(tex));
        HashMap<String,Integer> text1=new HashMap<>();
        System.out.println(text);

//        Collections.sort(text);
        for (int i=0; i<tex.length; i++){//String t : text) {
            Integer count = 0;

            ListIterator<String> iterator=text.listIterator();
            while (iterator.hasNext()) {
                if (tex[i].equals(iterator.next())) {
                    count++;
                }
                text1.put(tex[i],count);

            }

        }
        System.out.println(text1);






    }
}
