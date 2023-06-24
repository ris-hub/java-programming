package Data_Structures;
import java.util.*;
import java.util.Scanner;
public class Linked_List {
    
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
               // Node<Integer> temp = head;
                /*while (temp.next != null) {
                    temp = temp.next;

                }
                temp.next = newNode;*/
                tail.next=newNode;
                tail=newNode;   //tail=tail.next
            }
            data = sc.nextInt();
        }
        return head;
    }
    public static void print(Node<Integer> head)
    {
        while(head!=null)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    public static void main(String[] args) {
        Node <Integer> head = takeinput();
        print(head);
    }
    
}
