//Booyer Moore Majority Voting Algorithm
public class MajorityElement {
    public static void main(String[] args) {
        String s="aaaccbbcccbccaaa";
        int c=1;
        char ch=s.charAt(0);
        for (int i=1;i<s.length();i++){
            if(c==0) {
                ch = s.charAt(i);
                c = 1;
            }
            else {
                if (s.charAt(i) == ch)
                    c++;
                else
                    c--;
            }
        }
        System.out.println(ch);
        System.out.println(c);
    }
}
