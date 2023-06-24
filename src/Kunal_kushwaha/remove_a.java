package Kunal_kushwaha;

public class remove_a {
    public static void main(String[] args) {
        //skip("", "bccaada");
        System.out.println(skip("bccaada"));
        System.out.println(skipapple("bcdapplefg"));
    }
    //Passing the unprocessed string and printing in the function itself
    public static void skip(String up, String p){
        if(p.isEmpty()){
            System.out.println(up);
            return;
        }
        char c = p.charAt(0);
        if(c == 'a')
            skip(up, p.substring(1));
        else
            skip(up+c , p.substring(1));
    }
    //returning the output string
    static String s = "";
    public static String skip(String p){
        if(p.isEmpty())
            return "";

        char c = p.charAt(0);
        if(c == 'a')
            return skip(p.substring(1));
        else {
            return c + skip(p.substring(1));
        }
    }
    public static String skipapple(String p){
        if(p.isEmpty())
            return "";

        if(!p.startsWith("apple") && p.startsWith("app"))
            return skip(p.substring(3));
        else
            return p.charAt(0) + skip(p.substring(1));
    }
}
