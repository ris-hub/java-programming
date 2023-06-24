package Kunal_kushwaha;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        permutations("", "abc");
        System.out.println(permutationslist("", "abc"));
        System.out.println(permutationslistcount("", "abc"));
    }

    private static int permutationslistcount(String p, String up) {
        if(up.isEmpty())
            return 1;

        char ch = up.charAt(0);
        int c=0;
        for(int i=0;i<p.length()+1;i++){
            String f = p.substring(0, i);
            String s=  p.substring(i, p.length());
            c = c + permutationslistcount(f+ch+s, up.substring(1));
        }
        return c;
    }

    private static void permutations(String p, String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i=0;i<p.length()+1;i++){
            String f = p.substring(0, i);
            String s=  p.substring(i, p.length());
            permutations(f+ch+s, up.substring(1));
        }
    }
    private static ArrayList<String> permutationslist(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for(int i =0;i<p.length()+1;i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permutationslist(f+ch+s, (up.substring(1))));
        }
        return ans;
    }
}