
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Books> books = new ArrayList<>();
        
        while(true){
            System.out.println("Input the name of the book, empty stops:");
            String name = scanner.nextLine();
            
            if(name.equals("")){
                break;
            }
            System.out.println("Input the age recommendation: ");
            int age = Integer.valueOf(scanner.nextLine());
            
            books.add(new Books(name,age));
            
        }
        System.out.println(books.size()+" books in total.");
        System.out.println("");
        System.out.println("Books:");
        
        
        
        Comparator<Books> c = Comparator.comparing(Books :: getAge).thenComparing(Books::getName);
        
        Collections.sort(books, c);
        
        for(Books book: books){
            System.out.println(book);
        }
    }

}
