package Kunal_kushwaha;

import com.inheritance.A;

import java.util.ArrayList;
import java.util.List;

public class tesst {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int i=0;i<3;i++){
            List<Integer> inner = new ArrayList<>(outer.get(i));
            inner.add(arr[i]);
            outer.add(inner);
        }
        System.out.println(outer);
    }
}
