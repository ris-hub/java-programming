package Kunal_kushwaha;

import java.util.ArrayList;

public class subset {
    public static void main(String[] args) {

        //subseq("", "abd");
        //System.out.println(arraylistsubseq("", "abc"));
        asciisubseq("", "abc");
    }

    public static ArrayList<String> arraylistsubseq(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = arraylistsubseq(p+ch, up.substring(1));
        ArrayList<String> right = arraylistsubseq(p, up.substring(1));
        left.addAll(right);
        return left;
    }

    public static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p+ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    public static void asciisubseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        asciisubseq(ch + p, up.substring(1));
        asciisubseq(p, up.substring(1));
        asciisubseq(p + (ch+0), up.substring(1));
    }
}
