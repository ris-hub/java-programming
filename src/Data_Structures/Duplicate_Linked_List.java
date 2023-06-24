package Data_Structures;

import java.util.Scanner;

public class Duplicate_Linked_List {
    public static Node<Integer> duplicate(Node<Integer> head)
    {
        Node<Integer> current = head;
        while(current != null)
        {
            Node<Integer> temp = current.next;
            current.next = new Node<Integer>(current.data);
            current.next.next = temp;
            current = temp;
        }
        current = head;

        //Setting Random pointers of new Nodes
        while(current != null)
        {
            if(current.next != null)
            {
                current.next.random = (current.random != null) ? current.random.next : null;

            }
            current = current.next.next;
        }
        Node<Integer> orig = head , copy = head.next;
        Node<Integer> temp= copy;

        //Separating both the Linked Lists
        while(orig != null && copy.next != null)
        {
            orig.next = orig.next.next;
            copy.next = copy.next.next;
            orig = orig.next;
            copy = copy.next;
        }
        return temp;
    }
    public static Node<Integer> takeinput()
    {
        System.out.println("Enter elements in linked list");
        Node<Integer> head =null , tail=null;
        Scanner sc=new Scanner(System.in);
        int data = sc.nextInt();
        while(data !=-1)
        {
            Node<Integer> newNode = new Node<Integer>(data);
            if(head == null) {
                head = newNode;
                tail=newNode;
            }
            else {
                tail.next=newNode;
                tail=newNode;   //tail=tail.next
            }
            data = sc.nextInt();
        }
        return head;
    }
    public static void print(Node<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static void main(String[] args) {
        Node<Integer> head = takeinput();
        print(head);
        head = duplicate(head);
        System.out.println();
        System.out.println("Duplicate List");
        print(head);
    }
}
