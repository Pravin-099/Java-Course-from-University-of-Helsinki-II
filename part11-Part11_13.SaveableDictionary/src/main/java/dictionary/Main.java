package dictionary;

public class Main {
    public static void main(String[] args) {
        // You can test your dictionary here
        
        SaveableDictionary dictionary = new SaveableDictionary("words.txt");
        boolean wasSuccessful = dictionary.load();
        System.out.println(dictionary.translate("olut"));;
        dictionary.save();
        
        
        
        
        if (wasSuccessful) {
            System.out.println("Successfully loaded the dictionary from file");
        }

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("ohjelmointi"));
        System.out.println(dictionary.translate("alla oleva"));
        
    }
}
