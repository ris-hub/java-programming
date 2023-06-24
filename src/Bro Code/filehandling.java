import java.io.File;

public class filehandling{
    public static void main(String[] args) {
        
        File file = new File("D:\\java lab\\src\\Bro Code\\secret_message.txt");
        
        if(file.exists()){
            System.out.println("That file exists");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            file.delete();
        }
        else{
            System.out.println("That file doesn't exists");
        }
    }
}