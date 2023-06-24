package Kunal_kushwaha;

public class customstack {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int top=-1;

    public customstack(){
        this(DEFAULT_SIZE);
    }

    public customstack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){

        if(isFull()){
            System.out.println("Stack is Full!!!");
            return false;
        }
        top++;
        data[top] = item;
        return true;
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot pop from an empty stack");
        }
        return data[top--];
    }

    public int peek() throws StackException {
        if(isEmpty()){
            throw new StackException("Canonot peek from an empty stack::");
        }
        return data[top];
    }
    private boolean isEmpty() {
        return top == -1;
    }

    private boolean isFull() {
        return top == data.length - 1;
    }    
}
