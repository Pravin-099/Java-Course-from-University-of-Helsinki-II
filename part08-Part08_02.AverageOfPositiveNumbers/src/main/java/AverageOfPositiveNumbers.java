
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int average = 0;
        int inputCount = 0;
        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            
            if(number == 0){
                if(average <= 0){
                    System.out.println("Cannot calculate the average");
                }else{
                    System.out.println((1.0)*average/inputCount);
                }
                break;
            }else if(number > 0){
                average =average+number;
                inputCount++;
                
            }
            
        }
    }
}
