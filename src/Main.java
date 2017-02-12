import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String[] listOfVar = {"A", "B", "C", "D", "E", "F", "G", "H"};
        Map<String, Integer> initialMap = new HashMap<String, Integer>();

        //initialize map to be "Var":0
        for(String var: listOfVar){
            initialMap.put(var, 0);
        }
        System.out.println(initialMap.values());
        recurseDrawTree(initialMap);

    }

    public static void recurseDrawTree(Map<String, Integer> map){
        recursionHelper(new StringBuilder(), 0, new Node(map));
    }

    public static void recursionHelper(StringBuilder builder, int level, Node root){

    }


}
