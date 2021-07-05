
import java.util.Scanner;

class myLibrary{
    public void select(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the Option");
        System.out.println("1. Issue Book \t 2. Return Book");
        System.out.println("3. Add Book   \t 3. Search Book");
        sc.close();
    }
    
}


public class operates {
    public static void main(String[] args) {
        myLibrary lib = new myLibrary();
        lib.select();
    }
}
