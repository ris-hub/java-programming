public class string {
    public static void main(String[] args) {
        String s = "baa";
        String st= "bd";
        int x = 0;
        for(int i=0;i<s.length();i++)
            x=x^s.charAt(i);
        System.out.println(x);
    }
}
