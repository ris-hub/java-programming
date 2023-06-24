package LEETCODE;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
            String st = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            //char str[] = st.toCharArray();
            //System.out.println(st);
            int low=0, high=st.length()-1;
            while(low<=high){
                if(st.charAt(low) != st.charAt(high))
                    return false;
                low++;
                high--;
            }
            return true;
        }

    public static void main(String[] args) {
        String s ="A man, a plan, a canal: Panama";
        if(isPalindrome(s))
            System.out.println("Palindrome");
        else
            System.out.println("NOT");

    }
}
