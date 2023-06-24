package SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class CountOccurenceOfAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        System.out.println("Enter window string: ");
        String st = sc.nextLine();
        int n = s.length();
        int k = st.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<k;i++){
            if(map.containsKey(st.charAt(i)))
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            else
                map.put(s.charAt(i), 1);
        }
        int i=0, j=0, count=map.size();
        List<Integer> ans = new ArrayList<Integer>();
        while(j < n){

            // Calculation:
            char ch = s.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)-1);
                if(map.get(ch) == 0){
                    count--;
                }
            }

            if(j-i+1 < k)
                j++;
            else if(j-i+1 ==k){
                if(count == 0){
                    ans.add(i);
                }
                char ch1 = s.charAt(i);
                if(map.containsKey(ch1)){
                    map.put(ch1, map.get(ch1)+1);
                    if(map.get(ch1) >= 1){
                        count++;
                    }
                }
                i++;
                j++;
            }
        }
        System.out.println(ans);
    }
}
