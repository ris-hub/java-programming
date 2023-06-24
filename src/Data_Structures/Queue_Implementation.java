package Data_Structures;

public class Queue_Implementation {

    private static Node<Integer> rear = null, front = null;

    // Utility function to dequeue the front element
    public static int dequeue()     // delete at the beginning
    {
        if (front == null)
        {
            System.out.print("\nQueue Underflow");
            System.exit(1);
        }

        Node<Integer> temp = front;
        System.out.printf("Removing %d\n", temp.data);

        // advance front to the next node
        front = front.next;

        // if the list becomes empty
        if (front == null) {
            rear = null;
        }

        // deallocate the memory of the removed node and
        // optionally return the removed item
        int item = temp.data;
        return item;
    }

    // Utility function to add an item to the queue
    public static void enqueue(int item)     // insertion at the end
    {
        // allocate a new node in a heap
        Node<Integer> node = new Node<Integer>(item);
        System.out.printf("Inserting %d\n", item);

        // special case: queue was empty
        if (front == null)
        {
            // initialize both front and rear
            front = node;
            rear = node;
        }
        else {
            // update rear
            rear.next = node;
            rear = node;
        }
    }

    // Utility function to return the top element in a queue
    public static int peek()
    {
        // check for an empty queue
        if (front != null) {
            return front.data;
        }
        else {
            System.exit(1);
        }

        return -1;
    }

    // Utility function to check if the queue is empty or not
    public static boolean isEmpty() {
        return rear == null && front == null;
    }
}

class queue
{
    public static void main(String[] args)
    {
        Queue_Implementation q = new Queue_Implementation();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);

        System.out.printf("The front element is %d\n", q.peek());

        q.dequeue();
        q.dequeue();
        q.dequeue();
        //q.dequeue();
        q.enqueue(5);

        if (q.isEmpty()) {
            System.out.print("The queue is empty");
        }
        else {
            System.out.print("The queue is not empty");
        }
    }
}

