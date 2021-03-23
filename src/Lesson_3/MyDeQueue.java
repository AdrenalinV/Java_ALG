package Lesson_3;

public class MyDeQueue<T> {
    private T[] items;
    private int capacity;
    private int size;
    private int begin;
    private int end;
    private static final int DEFAULT_CAPACITY = 10;

    public MyDeQueue() {
        this.capacity = DEFAULT_CAPACITY;
        this.items = (T[]) new Object[this.capacity];
        this.size = 0;
        this.begin = 0;
        this.end = 0;

    }

    public MyDeQueue(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity < 0:" + this.capacity);
        }
        this.capacity = capacity;
        this.items = (T[]) new Object[this.capacity];
        this.size = 0;
        this.begin = 0;
        this.end = 0;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        if (isEmpty()) {
            sb.append("]");
            return sb.toString();
        }
        int index = this.begin;
        do {
            sb.append(items[index]);
            sb.append(", ");
        } while ((index = nextIndex(index)) != this.end);
        sb.setLength(sb.length() - 2);
        sb.append(" ]");
        return sb.toString();

    }

    private int nextIndex(int index) {
        int tmp = index + 1;
        if (tmp == capacity) {
            tmp = 0;
        }
        if (tmp == begin) {
            return -1;
        }
        return tmp;
    }

    private int prefIndex(int index) {
        int tmp = index - 1;
        if (tmp < 0) {
            tmp = this.capacity - 1;
        }
        if (tmp == end) {
            return -1;
        }
        return tmp;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public void addRight(T item) {
        if (size == capacity) {
            resize();
        }
        this.items[this.end] = item;
        this.end = nextIndex(this.end);
        this.size++;
    }

    public void addLeft(T item) {
        if (size == capacity) {
            resize();
        }
        this.begin = prefIndex(this.begin);
        this.items[this.begin] = item;
        this.size++;
    }

    public T peekLeft() {
        return this.items[this.begin];
    }

    public T peekRight() {
        return this.items[prefIndex(this.end)];
    }

    public T popLeft() {
        if (isEmpty()) {
            return null;
        }
        T tmp;
        tmp = this.items[this.begin];
        this.begin = nextIndex(this.begin);
        size--;
        return tmp;
    }

    public T popRight() {
        if (isEmpty()) {
            return null;
        }
        T tmp;
        this.end = prefIndex(this.end);
        tmp = this.items[this.end];
        size--;
        return tmp;
    }

    private void resize() {
        this.capacity = this.capacity * 2;
        T[] tmp = (T[]) new Object[this.capacity];
        System.arraycopy(items, begin, tmp, 0, this.size - begin);
        if (this.end > 0) {
            System.arraycopy(items, 0, tmp, this.size - begin, this.end);
        }
        this.begin = 0;
        this.end = size;
        items = tmp;
    }
}
