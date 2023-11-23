class StackException extends Exception {
    public StackException(String msg) {
        super("StackException: " + msg);
    }
}

class MyStack {
    private int[] stack;
    private int top;
    private int capacity;

    public MyStack(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }

    public synchronized void push(int value) throws StackException {
        if (top >= capacity - 1) {
            throw new StackException("Stack overflow");
        }
        top+=1;
        stack[top] = value;
        System.out.println("Pushed: " + value);
    }

    public synchronized int pop() throws StackException {
        if (top == -1) {
            throw new StackException("Stack underflow");
        }
        int value = stack[top--];
        System.out.println("Popped: " + value);
        return value;
    }
}

class pop_stack extends Thread{
    MyStack a;
    pop_stack(MyStack a){
        this.a=a;
    }

    public void run(){
        try{
            for(int i=0;i<15;i++){
                a.pop();
            }
        }
        catch(StackException e){
            System.out.println(e.getMessage());
        }
    }
}

class push_stack extends Thread{
    MyStack a;
    push_stack(MyStack a){
        this.a=a;
    }

    public void run(){
        try{
            for(int i=1;i<=15;i++){
                a.push(i);
            }
        }
        catch(StackException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){}
    }
}

public class lab_7_Q2 {
    public static void main(String[] args) {
        MyStack stack = new MyStack(15);
        push_stack a = new push_stack(stack);
        pop_stack b = new pop_stack(stack);
        a.start();
        b.start();
    }
}