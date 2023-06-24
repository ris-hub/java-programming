import java.util.Arrays;

import com.inheritance.A;

public class anagram {
    public static void main(String[] args) {
        String s="rishabh";
        String t="bhahsir";
        System.out.print(isanagram(s, t));
    }
    static boolean isanagram(String s, String t){
        int []a= new int[26];
        for(int i=0;i<s.length();i++)
            a[s.charAt(i) - 'a']++;
        for(int i=0;i<t.length();i++)
            a[t.charAt(i) - 'a']--;
        System.out.println(Arrays.toString(a));
        for(int i=0;i<26;i++){
            if(a[i]!=0)
                return false;
        }
        return true;
    }
}
