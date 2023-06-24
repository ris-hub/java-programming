package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//import static jdk.internal.org.jline.utils.Colors.s;

public class NQueen {
    static ArrayList<String> ans = new ArrayList<>();
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        //int r = sc.nextInt();
        String[] str =sc.nextLine().split(",");
        ans.add("");
        System.out.println(ans);

        for(String ele: str)
            System.out.println(ele);
        String st = Arrays.toString(str);
        String st1="";
        for (int i = 0; i < st.length(); i++) {
                if(st.charAt(i)!=' ')
                {
                    st1=st1+st;
                }
                else
                {
                    ans.add(st);
                }
        }
    }

}
