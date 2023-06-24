package Data_Structures;

import java.util.Scanner;

public class Palindromic_Linked_List {
    public static Node<Integer> takeinput()
    {
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

    public static Node<Integer> fastmidpoint(Node <Integer> head)
    {
        int c=0, i=0;
        Node<Integer> temp = head;
        while(temp != null)
        {
            temp= temp.next;
            c++;
        }
        System.out.println(c);
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        if(c % 2 ==0)
        {
            while(fast != null && fast.next.next != null)
            {
                slow = slow.next;
                fast = fast.next.next;
                i++;
            }
        }
        else
        {
            while(fast != null && fast.next != null)
            {
                slow = slow.next;
                fast = fast.next.next;
                i++;
            }
        }
        return slow;
    }
    /* public static Node<Integer> insertAtPos(Node<Integer> head, int data, int pos){
         Node<Integer> newNode= new Node<Integer>(data);
         if(pos == 0)
         {
             newNode.next=head;
             return newNode;
         }
         Node<Integer> temp =head;
         int i=0;
         while(i< pos-1 && temp!=null){
             temp=temp.next;
             i++;
         }
         if(temp !=null) {
             newNode.next = temp.next; //creating a link before breaking
             temp.next = newNode;
         }
         return head;
     }*/
        /*public static Node<Integer> deleteAtPos(Node<Integer> head, int pos){
            //Node<Integer> newNode= new Node<Integer>(data);
            if(head == null)
            {
                return head;
            }
            if(pos == 0)
            {
                head =head.next;
                return head;
            }
            Node<Integer> temp =head;
            int i=0;
            while(i< pos-1 && temp!=null){
                temp=temp.next;
                i++;
            }
            if(temp ==null || temp.next==null) {
                return head;
            }
            temp.next=temp.next.next;
            return head;
        }*/
    public static void print(Node<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static Node<Integer> reverse(Node<Integer> head)
    {
        Node<Integer> prev = null;
        Node<Integer> current = head;
        Node<Integer> temp = null;
        while(current != null)
        {
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }
    public static boolean  palindrome(Node<Integer> head)
    {
        if(head == null)
            return true;
        Node<Integer> mid = fastmidpoint(head);
        Node<Integer> last = reverse(mid.next);
        Node<Integer> current = head;
        while(last != null)
        {
            if(last.data != current.data)
                return false;
            last = last.next;
            current = current.next;
        }
        return true;
    }
    public static void main(String[] args) {
        Node<Integer> head = takeinput();
        //head =insertAtPos(head, 80,6);
        //head= deleteAtPos(head,3);
        print(head);
        System.out.println();
        boolean flag = palindrome(head);
        if(flag)
            System.out.println("Palindromic");
        else
            System.out.println("NOT Palindromic");
        //fastmidpoint(head);
    }

}
