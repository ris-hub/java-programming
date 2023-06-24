package Kunal_kushwaha;

public class PhonePad {
    public static void main(String[] args) {
        pad("", "12");
    }
    public static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0' + 1; //this will change '2' into 2
        for(int i=(digit-2) * 3; i<(digit-1)*3;i++){
            char ch =(char)('a' + i);
            pad(p+ch, up.substring(1));
        }
    }
}
