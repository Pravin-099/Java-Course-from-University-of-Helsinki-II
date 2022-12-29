
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String, String> nickName = new HashMap<>();
        
        nickName.put("matthew","matt");
        nickName.put("michae","mix");
        nickName.put("arthur", "artie");
        
        System.out.println(nickName.get("matthew"));
        
    }

}
