import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = new ArrayList<>();
        
        while(true){
            String inputs = scanner.nextLine();
            if(inputs.equals("")){
                break;
            }
            input.add(inputs);
        }
        
        input.stream().forEach(System.out::println);
    }
}
