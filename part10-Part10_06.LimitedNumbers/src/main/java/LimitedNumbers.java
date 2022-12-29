
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> input = new ArrayList<>();
        while(true){
            int inputs = Integer.valueOf(scanner.nextLine());
            if(inputs < 0){
                break;
            }
            
            input.add(inputs);
            
        }
        input.stream()
             .filter(s -> ((s<6)&&(s>0)))
             .forEach(System.out:: println);

    }
}
