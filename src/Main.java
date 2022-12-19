import java.util.ArrayList;
import java.util.List;

public class Main {
    static class EmptyException extends Exception {
        public EmptyException() {
        }
        public EmptyException(String s) {
        }
    }
    static class FullException extends Exception {
        public FullException() {
            super();
        }
        public FullException(String s) {
            super(s);
        }
    }

    public static void main(String[] args) throws FullException, EmptyException {
        int size = 3;
        MyQueue<Integer> queue = new Queue<>(size);
        queue.enqueue(1);
        queue.enqueue(2);
        System.out.println(queue.first());
        queue.dequeue();
        System.out.println(queue.first());
    }
}