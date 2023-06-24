import java.util.Scanner;

public class String_book {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of books: ");
        int n = sc.nextInt();
        String[] books = new String[n];
        System.out.println("Enter your " + n + " book here: ");
        for (int i = 0; i < n; i++) {
            books[i] = sc.next();
        }
        System.out.println("Entered books are: ");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
    }
}

