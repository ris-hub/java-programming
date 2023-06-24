public class rec {
    public static void main(String[] args) {
        rec(7, 1);
    }   
    static void rec(int n, int i){
        if(i > n)
            return;
        for(int j=0;j<i;j++){
            System.out.print("*");
        }
        System.out.println();
        rec(n, i++);
        for(int j=0;j<i;j++){
            System.out.print("*");
        }
        System.out.println();
    } 
}

