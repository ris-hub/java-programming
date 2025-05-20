public class Palindrome {
    public static void main(String[] args) {
        String s = "aaaabbaa";
        String res = "";
        int maxLength = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isPalindrome(s.substring(i, j + 1)) && maxLength < (j - i + 1)) {
                    res = s.substring(i, j + 1);
                    maxLength = j - i + 1;
                }
            }
        }
        System.out.println(res);
    }

    public static boolean isPalindrome(String str) {
        int n = str.length() - 1;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i))
                return false;
        }
        return true;
    }
}
