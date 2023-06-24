package Data_Structures;

public class Stack_Using_Array {
    int a[];
    int top;
    int capacity;
    public Stack_Using_Array(int capacity)
    {
        this.capacity = capacity;
        top = -1;
        a = new int[capacity];
    }
    public void push(int data) throws Exception
    {
        if(top ==  capacity-1)
        {
            throw new Exception("Overflow!!");
        }
        top++;
        a[top] = data;
    }
    public int pop() throws Exception
    {
        if(top == -1)
        {
            throw new Exception("Underflow!!");
        }
        int res = a[top];
        top--;
        return res;
    }
    int peek() throws Exception
    {
        if(top == -1)
        {
            throw new Exception("No Elements in Stack");
        }
        return a[top];
    }
    boolean isEmpty()
    {
        if(top == -1)
            return true;
        else
            return false;
    }
    public void print()
    {
        if(top > -1)
        {
            for(int i=0; i<=top; i++)
            {
                System.out.print(a[i]+" ");
            }
        }
        else
            System.out.println("Stack is Empty");
    }
    public static void main(String [] args) throws Exception
    {
        Stack_Using_Array s = new Stack_Using_Array(5);
        s.push(5);
        s.push(10);
        s.push(15);
        s.push(20);
        s.print();
        System.out.println();
        int ele =s.peek();
        System.out.println("Top Element: "+ ele);
        ele = s.pop();
        System.out.println("Popped Element: "+ele);
        s.print();
        boolean flag = s.isEmpty();
        if(flag)
            System.out.println("Empty");
        else
            System.out.println("Not Empty");
    }
}
