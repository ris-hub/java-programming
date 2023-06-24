package java_collection_frameworks;

import java.util.LinkedList;
import java.util.Queue;

public class Myqueue {
    public static void main (String args[])
    {
        Queue<Integer> q = new LinkedList<>();

        q.add(12);
        q.add(23);
        q.add(34);

        System.out.println(q);

        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
