package Data_Structures;


import java.util.Scanner;

public class Linked_List_operations {

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

    public static Node<Integer> insertAtPos(Node<Integer> head, int data, int pos){
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
    }
    public static Node<Integer> deleteAtPos(Node<Integer> head, int pos){
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
    }
    public static void print(Node<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    //Searching an element in linked list
    public static void search(Node<Integer> head)
    {
        Node<Integer> temp =head;
        System.out.println();
        int i=0;
        boolean flag= false;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter element to be found!!");
        int ele=s.nextInt();
        if(head == null)
        {
            System.out.println("Empty linked list");
        }
        else
        {
            while(temp!=null)
            {
                if(temp.data == ele) {
                    flag=true;
                    break;
                }
                i++;
                temp= temp.next;
            }
            if(flag)
                System.out.println("Element found!!!"+" at position "+(i+1));
            else
                System.out.println("Element not found...retry");
        }
    }
    public static void main(String[] args) {
        Node<Integer> head = takeinput();
        //head =insertAtPos(head, 80,6);
        //head= deleteAtPos(head,3);
        print(head);
        search(head);
    }
}
