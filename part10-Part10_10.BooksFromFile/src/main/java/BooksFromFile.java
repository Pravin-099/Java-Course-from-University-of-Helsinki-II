
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }
    
    public static List<Book> readBooks(String file){
        List<Book> books = null;
        
        try{
            books = Files.lines(Paths.get(file)).map(m -> m.split(","))
                                        .map(m-> new Book(m[0],Integer.valueOf(m[1]),Integer.valueOf(m[2]),m[3]))
                                        .collect(Collectors.toCollection(ArrayList::new));
        }
        
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        return books;
    }

}
