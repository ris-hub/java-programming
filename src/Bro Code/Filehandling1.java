import java.io.FileWriter;
import java.io.IOException;

public class Filehandling1 {
    public static void main(String[] args) {
            try {
                FileWriter writer  = new FileWriter("poem.txt");
                writer.write("Roses are red \nViolets are Blue \nBooty booty booty booty \nRockin' everywhere");
                writer.append("\nA poem by bro");
                writer.close();
            } 
            catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
    }
    
}
