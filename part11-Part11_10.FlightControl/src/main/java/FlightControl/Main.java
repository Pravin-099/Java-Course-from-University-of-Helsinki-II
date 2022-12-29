package FlightControl;
import java.util.Scanner;
import FlightControl.ui.TextUI;
import FlightControl.logic.FlightControl;

public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        Scanner scanner = new Scanner(System.in);
        FlightControl flight = new FlightControl();
        TextUI ui = new TextUI(flight,scanner );
        
        ui.start();
        
        
    }
}
