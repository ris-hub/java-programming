package Trilogy;

import java.util.ArrayList;
import java.util.Collections;

public class worthyKing {
    public int solve(ArrayList<Integer> A){
        Collections.sort(A);
        int x=1;
        if(A.get(0) == 0)
            return 0;
        for(int i=0;i<A.size();i++){
            int d=A.get(i);
            while(d >=i){
                x++;
            }
        }
        return x;
    }

    public static void main(String[] args) {

    }
}
