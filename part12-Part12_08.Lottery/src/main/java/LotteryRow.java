
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the random number generation here
        int number;
        for(int i=0;(numbers.size()<7);i++){
            number = new Random().nextInt(41);
            if(number == 0){
                continue;
            }
            if(!containsNumber(number)){
                numbers.add(number);
            }
        }
        // the method containsNumber is probably useful
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        
        return numbers.contains(number);
    }
}

