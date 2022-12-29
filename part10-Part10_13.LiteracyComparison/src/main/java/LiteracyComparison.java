
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        ArrayList<Literacy> l = new ArrayList<>();
        
        
        try{
            Files.lines(Paths.get("literacy.csv"))
                 
                 .map(m -> m.trim().split(","))
                 
                 .map(m-> new Literacy(m[0],m[1],m[3],Integer.valueOf(m[4]),m[2].replace("(%)", ""),Double.valueOf(m[5]))).sorted()
                    
                 .forEach(m -> l.add(m));
                 
                 
                 
                 
            
        }
        
        catch(Exception e){
            System.out.println("Error:"+e.getMessage());
        }
        
        l.stream().forEach(System.out::println);
        
    }
}
