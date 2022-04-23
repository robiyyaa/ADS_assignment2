import java.util.*;

public class MyStack <T extends Comparable<T>>{
    private ArrayList<T> array;

    public MyStack () {
        array = new ArrayList<>();
    }

    public boolean empty() {
        return (array.size() == 0);
    }

    public int size() {
        return array.size();
    }

    public T peek() {
        if (array.size() == 0) {
            throw new IllegalStateException("Empty");
        }
        return array.get(array.size()-1);
    }

    public void push(Integer n) {
        array.add((T) n);
    }

    public T pop() {
        if (array.size() == 0) {
            throw new IllegalStateException("Empty");
        }
        return array.remove(array.size()-1);
    }

    @Override
    public String toString() {
        return "" + array.toString();
    }

    public static void main(String[] args) {
        MyStack res = new MyStack();

        res.push(24);
        res.push(30);
        res.push(50);
        res.push(100);
        res.push(100);

        System.out.println("Given stack: " + res);
        System.out.println("Stack size: " + res.size());

        System.out.println("Peek: " + res.peek());
        System.out.println("Stack after peek: " + res);

        System.out.println("Pop operation: " + res.pop());
        System.out.println("Stack after pop: " + res);

        System.out.println("Empty stack: " + res.empty());

    }
}
