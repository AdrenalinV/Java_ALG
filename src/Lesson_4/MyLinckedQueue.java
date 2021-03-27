package Lesson_4;

public class MyLinckedQueue<T> {
    private MyLinkedList<T> ll = new MyLinkedList<>();


    public void offer(T item) {
        ll.insertLast(item);
    }


    public T remove() {
        return ll.removeFirst();
    }


    public T element() {
        return ll.getFirst();
    }


    public int size() {
        return ll.size();
    }

    public boolean isEmpty() {
        return ll.isEmpty();
    }

    @Override
    public String toString() {
        return ll.toString();
    }
}
