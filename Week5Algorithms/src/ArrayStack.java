import java.util.Arrays;
/** Array-based Stack in Java */
public class ArrayStack<E> implements Stack<E> {
    public static final int CAPACITY = 1000; // Default array capacity
    private E[] data; // generic array
    private int t = -1; // index of the top element in stack
    public ArrayStack(){this (CAPACITY);} // constructs stack with default
    public ArrayStack(int capacity){ // constructs stack with given
        data = (E[]) new Object[capacity];
    }
    public int size() {return(t+1);}
    public boolean isEmpty() {return(t==-1);}
    public void push (E e) throws IllegalStateException {
        if (size() == data.length) throw new IllegalStateException ("Stack is full.");
        data[++t] = e;
    }
    public E top() {
        if (isEmpty()) return null;
        return data[t];
    }
    public E pop() {
        if (isEmpty()) return null;
        E answer = data[t];
        data[t] = null;
        t --;
        return answer;
    }
}