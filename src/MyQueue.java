import java.util.ArrayList;

public class MyQueue<T> {

    private ArrayList array;

    public MyQueue() {
        array = new ArrayList();
    }

    public boolean empty() {
        return (array.size() == 0);
    }

    public int size() {
        return array.size();
    }

    public T peek() {
        return (T) array.get(array.size()-1);
    }

    public T enqueue(Integer n) {
        return (T) array.remove(0);
    }

    public T dequeue(Integer n) {
        return (T) array.remove(0);
    }

}

