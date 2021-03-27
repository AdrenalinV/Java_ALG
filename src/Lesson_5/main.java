package Lesson_5;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        System.out.println(pow(5,2));
        System.out.println();
        System.out.println("Backpack:");
        ArrayList<Item> items= new ArrayList<>();
        items.add(new Item("Книга",1 ,600));
        items.add(new Item("Бинокль",2,500));
        items.add(new Item("Ноутбук",2 ,40000));
        items.add(new Item("Аптечка", 4,1500));
        items.add(new Item("Котелок",1  ,500));
        System.out.println(items);
        Backpack bp=new Backpack(4);
        bp.bruteForceList(items);
        System.out.println(bp.getBestItems());
        System.out.printf( String.valueOf(bp.getBestPrice()));


    }
    /*Написать программу по возведению числа в степень с помощью рекурсии.*/
    public static long pow(int x,int n){
        if(n==1){
            return x;
        }
        return x*pow(x,n-1);
    }


}
