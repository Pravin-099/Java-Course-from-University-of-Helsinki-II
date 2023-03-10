
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        while(true){
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }
            
            list.add(input);
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String prints = scanner.nextLine();
        if(prints.equals("n")){
            double avg = list.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(s -> (s<0))
                .average()
                .getAsDouble();
            System.out.println("Average of the negative numbers: "+avg);
        }
        
        if(prints.equals("p")){
            double avgs = list.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(s -> (s>=0))
                .average()
                .getAsDouble();
            System.out.println("Average of the positive numbers: "+avgs);
        }

    }
}
