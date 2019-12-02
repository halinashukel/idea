package com.unicorn.Collection;

import java.io.*;
import java.util.*;

public class Collection {
    public static void main(java.lang.String[] args) throws IOException {
//        InputStream inputStream = System.in;
//        Reader inputStreamReader = new InputStreamReader(inputStream);
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите числа через пробел :");
        String number=scanner.nextLine();
        String[] num = number.split(" ");
        Integer[] numb= new Integer[ num.length];

        for(int i=0; i!=num.length;i++)
            numb[i] = Integer.parseInt(num[i]);

        ArrayList<Integer> numberList= new ArrayList<>(Arrays.asList(numb));
        System.out.println(numberList);

        Collections.sort(numberList);
        System.out.println(numberList);
        Integer count = 1;
//        for(int i=0; i<numberList.size();i++)
//            if(i==10||i==9){
//                System.out.println(numberList.get(i));
//            }

//        ListIterator<Integer> iterator=numberList.listIterator();
//        while (iterator.hasNext()){
//            count++;
//            if(count==10||count==11){
//                System.out.println(iterator.next());
//            }
//
//        }

        for(Integer numberMin:numberList){

            if(count==10||count==11){
                System.out.println(numberMin);
            }
            count++;

        }




//        int[] a = new int[5];
//        for (int i = 0; i < 5; i++)
//            a[i] = sc.nextInt();


//        String s = new String("");
//        s = scanner.nextLine();
//        String[] s1;
//        s1 = s.split(" ");
//        int[] a = new int[s1.length];
//        for(int i=0; i!=s1.length;i++)
//            System.out.println(a[i] = Integer.parseInt(s1[i]));




//        System.out.println("Введите числа через пробел :");
//        String sNamber = reader.readLine(); //читаем строку с клавиатуры
//        int number = Integer.parseInt(sNamber); //преобразовываем строку в число.




    }
}
