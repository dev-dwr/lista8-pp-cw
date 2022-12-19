import java.util.ArrayList;
import java.util.List;

public class Queue<E> implements MyQueue<E> {

    private List<E> queue = new ArrayList<>();
    private int f;
    private int r;


    public Queue(int size) {
       for(int j = 0; j < size; j++) queue.add(null);
        this.f = 0;
        this.r = 0;
    }

    @Override
    public void enqueue(E x) throws Main.FullException {
        if (isFull()) throw new Main.FullException("queue is full");
        queue.set(r, x);
        r = (r + 1) % queue.size();
    }

    @Override
    public void dequeue() {
        if (!(f == r)){
            queue.set(f, null);
            f=(f+1)%queue.size();
        }
    }

    @Override
    public E first() throws Main.EmptyException {
        if (f == r) throw new Main.EmptyException("queue is empty");
        return queue.get(f);
    }

    @Override
    public boolean isEmpty() {
        return f == r;
    }

    @Override
    public boolean isFull() {
        return (r + 1) % queue.size() == f;
    }
}
