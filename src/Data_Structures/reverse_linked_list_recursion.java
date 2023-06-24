package Data_Structures;

import java.util.Scanner;

public class reverse_linked_list_recursion {
    public static Node<Integer> reverseR(Node<Integer> head)
    {
        if(head == null || head.next==null)
        {
            return head;
        }
        Node<Integer> finalHead=reverseR(head.next);
        Node<Integer> temp=finalHead;
        while(temp.next!= null)
        {
            temp= temp.next;
        }
        temp.next= head;
        head.next= null;
        return finalHead;
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

    public static void main(String args[])
    {
        Node<Integer> head = takeinput();
        System.out.println("Entered List:");
        print(head);
        System.out.println();
        System.out.println("Linked List in reverse order recursively:");
        head = reverseR(head);
        print(head);
    }
}
