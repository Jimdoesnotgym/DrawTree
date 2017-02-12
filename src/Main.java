import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String[] listOfVar = {"A", "B", "C", "D", "E", "F", "G", "H"};
        Map<String, Integer> initialMap = new HashMap<String, Integer>();

        //initialize map to be "Var":0
        for (String var : listOfVar) {
            initialMap.put(var, 0);
        }
        System.out.println(initialMap.values());
        recurseDrawTree(initialMap);

    }

    public static void recurseDrawTree(Map<String, Integer> map) {
        recursionHelper(new StringBuilder(), 0, new Node(map));
    }

    public static void recursionHelper(StringBuilder builder, int level, Node root) {

        if (level > root.map.size()) {
            return;
        } else {

            //set values
            switch (level) {
                case 1:
                    root.first.setA(root.possibleValues[0]);
                    root.second.setA(root.possibleValues[1]);
                    root.third.setA(root.possibleValues[2]);
                    root.fourth.setA(root.possibleValues[3]);
                    break;

                case 2:
                    root.first.setB(root.possibleValues[0]);
                    root.second.setB(root.possibleValues[1]);
                    root.third.setB(root.possibleValues[2]);
                    root.fourth.setB(root.possibleValues[3]);
                    break;

                case 3:
                    root.first.setC(root.possibleValues[0]);
                    root.second.setC(root.possibleValues[1]);
                    root.third.setC(root.possibleValues[2]);
                    root.fourth.setC(root.possibleValues[3]);
                    break;

                case 4:
                    root.first.setD(root.possibleValues[0]);
                    root.second.setD(root.possibleValues[1]);
                    root.third.setD(root.possibleValues[2]);
                    root.fourth.setD(root.possibleValues[3]);
                    break;

                case 5:
                    root.first.setE(root.possibleValues[0]);
                    root.second.setE(root.possibleValues[1]);
                    root.third.setE(root.possibleValues[2]);
                    root.fourth.setE(root.possibleValues[3]);
                    break;

                case 6:
                    root.first.setF(root.possibleValues[0]);
                    root.second.setF(root.possibleValues[1]);
                    root.third.setF(root.possibleValues[2]);
                    root.fourth.setF(root.possibleValues[3]);
                    break;

                case 7:
                    root.first.setG(root.possibleValues[0]);
                    root.second.setG(root.possibleValues[1]);
                    root.third.setG(root.possibleValues[2]);
                    root.fourth.setG(root.possibleValues[3]);
                    break;

                case 8:
                    root.first.setH(root.possibleValues[0]);
                    root.second.setH(root.possibleValues[1]);
                    root.third.setH(root.possibleValues[2]);
                    root.fourth.setH(root.possibleValues[3]);
                    break;

                default:
                    break;
            }


            //check for constraints
            if (root.constraintGood() || level == 0) {
                level++;
                recursionHelper(builder, level, root.first);
                recursionHelper(builder, level, root.second);
                recursionHelper(builder, level, root.third);
                recursionHelper(builder, level, root.fourth);
            } else {
                //we have reached leaf print path = false
                return;
            }
        }


    }


}
