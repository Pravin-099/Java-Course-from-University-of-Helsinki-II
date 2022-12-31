
public class Program {

    public static void main(String[] args) {
        // Test the MagicSquare class here
        
        
        MagicSquare m = new MagicSquare(3);
        for(int s: m.sumsOfDiagonals()){
            System.out.println(s);
        }
    }
}
