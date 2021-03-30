package Lesson_6;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<MyTreeMap> arr=new ArrayList<>();
        Random r=new Random();
        int tmp;
        MyTreeMap<Integer, String> map = new MyTreeMap<>();
        while (map.depth()<6){
            tmp=r.nextInt(201) - 100;
            System.out.println(tmp);
            map.put(tmp , "test");
        }
        System.out.println("isBalance: " + map.isBalance());
        System.out.println(map);
        System.out.println("depth: "+map.depth());
        map.delele(4);
        System.out.println(map);
    }
}
