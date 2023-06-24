package Data_Structures;

import java.util.Scanner;

public class Detect_Cycle {
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
    public static Node<Integer> makecycle(Node<Integer> head , int key)
    {
        Node<Integer> temp = head;
        int c=0;
        while(c <= key)
        {
            temp = temp.next;
            c++;
        }
        Node<Integer> loop = temp;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = loop;
        return head;
    }
    public static void Detect_Cycle(Node<Integer> head)
    {
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        while(fast != null && fast.next != null)
        {
            slow =slow.next;
            fast =fast.next.next;
            if(slow == fast)
            {
                System.out.println("Loop Detected");
                System.out.println(slow.data);
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node<Integer> head = takeinput();
        Node<Integer> temp1 = null;
        print(head);
        System.out.println("\nEnter the position to create loop:");
        int key = sc.nextInt();
        temp1 = makecycle(head,key);
        Detect_Cycle(temp1);
    }
}
