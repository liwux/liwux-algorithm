import java.util.HashMap;

public class Code05_HashMapTreeMap {

    //(K V)表
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("han","xinxin");

        System.out.println(map.containsKey("han"));
    }
}
