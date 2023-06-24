package Data_Structures;

import java.util.Scanner;

public class midpoint_of_linkedlist {
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
        public static void midpoint(Node<Integer> head)
        {
            int c=0, i=0;
            Node<Integer> temp = head;

            while(temp.next != null)
            {
                temp= temp.next;
                c++;
            }
            int mid=c/2;
            temp =head;
            System.out.println("\nMidpoint: "+mid);
            while(i < mid && temp != null)
            {
                temp = temp.next;
                i++;
            }
            if(temp !=null)
            {
                System.out.println(temp.data);
            }
        }

        public static void fastmidpoint(Node <Integer> head)
        {
            int c=0;
            Node<Integer> slow = head;
            Node<Integer> fast = head;
            while(fast != null && fast.next != null)
            {
                slow = slow.next;
                fast = fast.next.next;
                c++;
            }
            System.out.println(slow.data);
            System.out.println("Midepoint ="+ c);
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

        public static void main(String[] args) {
            Node<Integer> head = takeinput();
            //head =insertAtPos(head, 80,6);
            //head= deleteAtPos(head,3);
            print(head);
            midpoint(head);
            System.out.println();
            fastmidpoint(head);
        }

}
