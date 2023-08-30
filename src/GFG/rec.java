package GFG;
public class rec {
    public static void main(String[] args) {
        foo(4);
    }
    public static void foo(int i){
        if(i>1){
            foo(i/2);
            foo(i/2);
        }
        System.out.println("eb");
    }
}
