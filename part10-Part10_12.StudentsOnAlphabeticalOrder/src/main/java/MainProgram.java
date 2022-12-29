
import java.util.ArrayList;
import java.util.Collections;
public class MainProgram {

    public static void main(String[] args) {
        Student first = new Student("jamo1");
        Student second = new Student("jamo");
        ArrayList<Student> a = new ArrayList<>();
        a.add(first);
        a.add(second);
        System.out.println(first.compareTo(second));
        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);
    }
}
