package Data_Structures;

public class Stack_Implementation {
    Node<Integer> head;
    int size;
    public Stack_Implementation()
    {
        this.head = null;
        this.size = 0;
    }
    public void push(int data)
    {
        Node<Integer> temp = new Node<>(data);
        //Node<Integer> temp1 = null;
        temp.next = head;
        size++;
        head = temp;
    }
    public int peek() {
        if(head == null)
        {
            System.out.println("Stack is empty");
        }
        return head.data;
    }
    public int pop()
    {
        if(head == null)
        {
            System.out.println("Stack is empty");
        }
        int res = head.data;
        head = head.next;
        size++;
        return res;
    }
    public boolean isEmpty()
    {
        return head==null;
    }
    int size ()
    {
        return size;
    }
    public void print() {
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args)
    {
        Stack_Implementation s = new Stack_Implementation();
        s.push(5);
        s.push(10);
        s.push(15);
        s.push(20);
        s.print();
        int ele = s.peek();
        System.out.println("Top element"+ele);
        int popped_ele = s.pop();
        s.print();
        System.out.println("Popped element:"+ popped_ele);
        ele = s.peek();
        System.out.println("Top element"+ele);
        s.print();
        boolean flag = s.isEmpty();
        if(flag)
            System.out.println("Empty");
        else
            System.out.println("Not Empty");
        int size = s.size();
        System.out.println("size:"+size);
    }
}
