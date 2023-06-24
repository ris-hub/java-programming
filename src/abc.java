import java.util.ArrayList;
import java.util.Collections;

public class abc {

            static ArrayList n = new ArrayList<>();
            static void prime(String str)
            {

                int num=Integer.parseInt(str);
                int c=0;
                for(int i=2;i*i<=num;i++)
                {
                    if(num%i==0) {
                        c=1;
                        break;
                    }
                }
                if(c==0 & num>=2)
                    n.add(num);
            }


            public static void main(String[] args) {
            String numb = "140";
            for (int z = 1; z <= numb.length(); z++) {
                for (int k = z; k <= numb.length(); k++) {
                    prime(numb.substring(k - z, k));
                }
            }
            if(n.isEmpty())
                System.out.println(-1);
            else
                System.out.println(Collections.max(n));

        }


}
