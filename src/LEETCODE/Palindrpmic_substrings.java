package LEETCODE;

public class Palindrpmic_substrings {
    public static int countSubstrings(String s) {
        int palin = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                String st = s.substring(0, j + 1);
                int low = 0, high = st.length() - 1;
                while (low <= high) {
                    if (st.charAt(low) != st.charAt(high))
                        break;

                    if (low == high) {
                        palin++;
                        break;
                    }
                    low++;
                    high--;
                }
            }
        }
        return palin;
    }

    public static void main(String[] args) {
        System.out.println(countSubstrings("NITISH"));
    }
}
