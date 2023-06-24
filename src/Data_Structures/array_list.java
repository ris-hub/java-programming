package Data_Structures;

import java.util.ArrayList;

public class array_list {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.println(list1.size());
        list1.add(15);
        list1.add(20);
        list1.add(25);
        System.out.println(list1.size());
        System.out.println(list1);
        list1.add(2,50);
        System.out.println(list1);

        for(int e: list1)
            System.out.println(e);
    }
}
