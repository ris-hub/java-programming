package Data_Structures;

import java.util.*;
public class Node<T> {
    T data;
    Node<T> next;
    Node<T> random;
    Node(T data){
        this.data = data;
        this.next = null;
        this.random = null;
    }
}
