package Data_Structures;

public class linked_list_use {
    public static void main(String[] args) {
        Node<Integer> node1 = new Node<Integer>(10);
//        System.out.print(node1.data);
//        System.out.print(node1.next+"->");
        Node<Integer> node2 = new Node<Integer>(20);
        node1.next=node2;
        System.out.print(node1.data);
        System.out.print(node1.next+"->");
        System.out.print(node2.data);
        System.out.print(node2.next);
        System.out.println(node2);
    }
}
