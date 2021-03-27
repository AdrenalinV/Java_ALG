package Lesson_4;

import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        MyLinkedStack<Integer> mls = new MyLinkedStack<>();
        System.out.println("MyLinckedStack");
        System.out.println("isEmpty: " + mls.isEmpty());
        mls.push(1);
        mls.push(2);
        mls.push(3);
        System.out.println(mls);
        System.out.println("pop: " + mls.pop());
        System.out.println("pop: " + mls.pop());
        System.out.println(mls);
        mls.push(4);
        mls.push(5);
        System.out.println("peek: " + mls.peek());
        System.out.println(mls);
        System.out.println("size: " + mls.size());
        System.out.println("isEmpty: " + mls.isEmpty());

        System.out.println();

        MyLinckedQueue<String> mlq = new MyLinckedQueue<>();
        System.out.println("MyLinckedQueue");
        System.out.println("isEmpty: " + mlq.isEmpty());
        mlq.offer("1");
        mlq.offer("2");
        mlq.offer("3");
        mlq.offer("4");
        System.out.println(mlq);
        System.out.println("remove: " + mlq.remove());
        System.out.println("remove: " + mlq.remove());
        mlq.offer("5");
        mlq.offer("6");
        System.out.println("peek: " + mlq.element());
        System.out.println(mlq);
        System.out.println("size: " + mlq.size());
        System.out.println("isEmpty: " + mlq.isEmpty());
        System.out.println();

        System.out.println("MyLinkedList");
        MyLinkedList<Integer> ll=new MyLinkedList<>();
        ll.insertLast(1);
        ll.insertLast(2);
        ll.insertLast(3);
        ll.insertLast(4);
        ll.insertLast(5);
        ll.insertLast(6);
        System.out.println(ll);
        ListIterator<Integer> li= ll.listiterator();
        while(li.hasNext()){
            System.out.println(li.next());
        }
        System.out.println("remove ");
        li.remove();
        System.out.println(ll);

        while(li.hasPrevious()){
            System.out.println(li.previous());
        }
        System.out.println("set: 100");
        li.set(100);
        System.out.println(ll);
        li= ll.listiterator();
        System.out.println("3 next and add: 200");
        System.out.println(li.next());
        System.out.println(li.next());
        System.out.println(li.next());
        li.add(200);
        System.out.println(ll);
    }
}
