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
        recursionHelper(new StringBuilder(), 1, new Node(map));
    }

    public static void recursionHelper(StringBuilder builder, int level, Node root) {

        if (level > root.map.size()) {
            builder.append("true");
            String output = builder.toString();
            System.out.println(output);
            return;
        } else {

            //set values
            switch (level) {
                case 1:
                    root.first.setA(root.possibleValues[0]);
                    builder.append(root.first.map.keySet().toArray()[0] + " = " + root.possibleValues[0]);
                    if(root.first.constraintGood()){
                        level++;
                        recursionHelper(builder, level, root.first);
                    }else{
                        root.first.endPrint(builder);
                        return;
                    }

                    root.second.setA(root.possibleValues[1]);
                    builder.append(root.second.map.keySet().toArray()[0] + " = " + root.possibleValues[1]);
                    if(root.second.constraintGood()){
                        level++;
                        recursionHelper(builder, level, root.second);
                    }else{
                        root.second.endPrint(builder);
                        return;
                    }

                    root.third.setA(root.possibleValues[2]);
                    builder.append(root.third.map.keySet().toArray()[0] + " = " + root.possibleValues[2]);
                    if(root.third.constraintGood()){
                        level++;
                        recursionHelper(builder, level, root.third);
                    }else{
                        root.third.endPrint(builder);
                        return;
                    }

                    root.fourth.setA(root.possibleValues[3]);
                    builder.append(root.fourth.map.keySet().toArray()[0] + " = " + root.possibleValues[3]);
                    if(root.fourth.constraintGood()){
                        level++;
                        recursionHelper(builder, level, root.fourth);
                    }else{
                        root.fourth.endPrint(builder);
                        return;
                    }
                    break;

                case 2:
                    root.first.setB(root.possibleValues[0]);
                    builder.append(root.first.map.keySet().toArray()[0] + " = " + root.possibleValues[0]);
                    if(root.first.constraintGood()){
                        level++;
                        recursionHelper(builder, level, root.first);
                    }else{
                        root.first.endPrint(builder);
                        return;
                    }

                    root.second.setB(root.possibleValues[1]);
                    builder.append(root.second.map.keySet().toArray()[0] + " = " + root.possibleValues[1]);
                    if(root.second.constraintGood()){
                        level++;
                        recursionHelper(builder, level, root.second);
                    }else{
                        root.second.endPrint(builder);
                        return;
                    }

                    root.third.setB(root.possibleValues[2]);
                    builder.append(root.third.map.keySet().toArray()[0] + " = " + root.possibleValues[2]);
                    if(root.third.constraintGood()){
                        level++;
                        recursionHelper(builder, level, root.third);
                    }else{
                        root.third.endPrint(builder);
                        return;
                    }

                    root.fourth.setB(root.possibleValues[3]);
                    builder.append(root.fourth.map.keySet().toArray()[0] + " = " + root.possibleValues[3]);
                    if(root.fourth.constraintGood()){
                        level++;
                        recursionHelper(builder, level, root.fourth);
                    }else{
                        root.fourth.endPrint(builder);
                        return;
                    }
                    break;

                case 3:
                    root.first.setC(root.possibleValues[0]);
                    builder.append(root.first.map.keySet().toArray()[0] + " = " + root.possibleValues[0]);
                    if(root.first.constraintGood()){
                        level++;
                        recursionHelper(builder, level, root.first);
                    }else{
                        root.first.endPrint(builder);
                        return;
                    }

                    root.second.setC(root.possibleValues[1]);
                    builder.append(root.second.map.keySet().toArray()[0] + " = " + root.possibleValues[1]);
                    if(root.second.constraintGood()){
                        level++;
                        recursionHelper(builder, level, root.second);
                    }else{
                        root.second.endPrint(builder);
                        return;
                    }

                    root.third.setC(root.possibleValues[2]);
                    builder.append(root.third.map.keySet().toArray()[0] + " = " + root.possibleValues[2]);
                    if(root.third.constraintGood()){
                        level++;
                        recursionHelper(builder, level, root.third);
                    }else{
                        root.third.endPrint(builder);
                        return;
                    }

                    root.fourth.setC(root.possibleValues[3]);
                    builder.append(root.fourth.map.keySet().toArray()[0] + " = " + root.possibleValues[3]);
                    if(root.fourth.constraintGood()){
                        level++;
                        recursionHelper(builder, level, root.fourth);
                    }else{
                        root.fourth.endPrint(builder);
                        return;
                    }
                    break;

                case 4:
                    root.first.setD(root.possibleValues[0]);
                    builder.append(root.first.map.keySet().toArray()[0] + " = " + root.possibleValues[0]);
                    if(root.first.constraintGood()){
                        level++;
                        recursionHelper(builder, level, root.first);
                    }else{
                        root.first.endPrint(builder);
                        return;
                    }

                    root.second.setD(root.possibleValues[1]);
                    builder.append(root.second.map.keySet().toArray()[0] + " = " + root.possibleValues[1]);
                    if(root.second.constraintGood()){
                        level++;
                        recursionHelper(builder, level, root.second);
                    }else{
                        root.second.endPrint(builder);
                        return;
                    }

                    root.third.setD(root.possibleValues[2]);
                    builder.append(root.third.map.keySet().toArray()[0] + " = " + root.possibleValues[2]);
                    if(root.third.constraintGood()){
                        level++;
                        recursionHelper(builder, level, root.third);
                    }else{
                        root.third.endPrint(builder);
                        return;
                    }

                    root.fourth.setD(root.possibleValues[3]);
                    builder.append(root.fourth.map.keySet().toArray()[0] + " = " + root.possibleValues[3]);
                    if(root.fourth.constraintGood()){
                        level++;
                        recursionHelper(builder, level, root.fourth);
                    }else{
                        root.fourth.endPrint(builder);
                        return;
                    }
                    break;

                case 5:
                    root.first.setE(root.possibleValues[0]);
                    builder.append(root.first.map.keySet().toArray()[0] + " = " + root.possibleValues[0]);
                    if(root.first.constraintGood()){
                        level++;
                        recursionHelper(builder, level, root.first);
                    }else{
                        root.first.endPrint(builder);
                        return;
                    }

                    root.second.setE(root.possibleValues[1]);
                    builder.append(root.second.map.keySet().toArray()[0] + " = " + root.possibleValues[1]);
                    if(root.second.constraintGood()){
                        level++;
                        recursionHelper(builder, level, root.second);
                    }else{
                        root.second.endPrint(builder);
                        return;
                    }

                    root.third.setE(root.possibleValues[2]);
                    builder.append(root.third.map.keySet().toArray()[0] + " = " + root.possibleValues[2]);
                    if(root.third.constraintGood()){
                        level++;
                        recursionHelper(builder, level, root.third);
                    }else{
                        root.third.endPrint(builder);
                        return;
                    }

                    root.fourth.setE(root.possibleValues[3]);
                    builder.append(root.fourth.map.keySet().toArray()[0] + " = " + root.possibleValues[3]);
                    if(root.fourth.constraintGood()){
                        level++;
                        recursionHelper(builder, level, root.fourth);
                    }else{
                        root.fourth.endPrint(builder);
                        return;
                    }
                    break;

                case 6:
                    root.first.setF(root.possibleValues[0]);
                    builder.append(root.first.map.keySet().toArray()[0] + " = " + root.possibleValues[0]);
                    if(root.first.constraintGood()){
                        level++;
                        recursionHelper(builder, level, root.first);
                    }else{
                        root.first.endPrint(builder);
                        return;
                    }

                    root.second.setF(root.possibleValues[1]);
                    builder.append(root.second.map.keySet().toArray()[0] + " = " + root.possibleValues[1]);
                    if(root.second.constraintGood()){
                        level++;
                        recursionHelper(builder, level, root.second);
                    }else{
                        root.second.endPrint(builder);
                        return;
                    }

                    root.third.setF(root.possibleValues[2]);
                    builder.append(root.third.map.keySet().toArray()[0] + " = " + root.possibleValues[2]);
                    if(root.third.constraintGood()){
                        level++;
                        recursionHelper(builder, level, root.third);
                    }else{
                        root.third.endPrint(builder);
                        return;
                    }

                    root.fourth.setF(root.possibleValues[3]);
                    builder.append(root.fourth.map.keySet().toArray()[0] + " = " + root.possibleValues[3]);
                    if(root.fourth.constraintGood()){
                        level++;
                        recursionHelper(builder, level, root.fourth);
                    }else{
                        root.fourth.endPrint(builder);
                        return;
                    }
                    break;

                case 7:
                    root.first.setG(root.possibleValues[0]);
                    builder.append(root.first.map.keySet().toArray()[0] + " = " + root.possibleValues[0]);
                    if(root.first.constraintGood()){
                        level++;
                        recursionHelper(builder, level, root.first);
                    }else{
                        root.first.endPrint(builder);
                        return;
                    }

                    root.second.setG(root.possibleValues[1]);
                    builder.append(root.second.map.keySet().toArray()[0] + " = " + root.possibleValues[1]);
                    if(root.second.constraintGood()){
                        level++;
                        recursionHelper(builder, level, root.second);
                    }else{
                        root.second.endPrint(builder);
                        return;
                    }

                    root.third.setG(root.possibleValues[2]);
                    builder.append(root.third.map.keySet().toArray()[0] + " = " + root.possibleValues[2]);
                    if(root.third.constraintGood()){
                        level++;
                        recursionHelper(builder, level, root.third);
                    }else{
                        root.third.endPrint(builder);
                        return;
                    }

                    root.fourth.setG(root.possibleValues[3]);
                    builder.append(root.fourth.map.keySet().toArray()[0] + " = " + root.possibleValues[3]);
                    if(root.fourth.constraintGood()){
                        level++;
                        recursionHelper(builder, level, root.fourth);
                    }else{
                        root.fourth.endPrint(builder);
                        return;
                    }
                    break;

                case 8:
                    root.first.setH(root.possibleValues[0]);
                    builder.append(root.first.map.keySet().toArray()[0] + " = " + root.possibleValues[0]);
                    if(root.first.constraintGood()){
                        level++;
                        recursionHelper(builder, level, root.first);
                    }else{
                        root.first.endPrint(builder);
                        return;
                    }

                    root.second.setH(root.possibleValues[1]);
                    builder.append(root.second.map.keySet().toArray()[0] + " = " + root.possibleValues[1]);
                    if(root.second.constraintGood()){
                        level++;
                        recursionHelper(builder, level, root.second);
                    }else{
                        root.second.endPrint(builder);
                        return;
                    }

                    root.third.setH(root.possibleValues[2]);
                    builder.append(root.third.map.keySet().toArray()[0] + " = " + root.possibleValues[2]);
                    if(root.third.constraintGood()){
                        level++;
                        recursionHelper(builder, level, root.third);
                    }else{
                        root.third.endPrint(builder);
                        return;
                    }

                    root.fourth.setH(root.possibleValues[3]);
                    builder.append(root.fourth.map.keySet().toArray()[0] + " = " + root.possibleValues[3]);
                    if(root.fourth.constraintGood()){
                        level++;
                        recursionHelper(builder, level, root.fourth);
                    }else{
                        root.fourth.endPrint(builder);
                        return;
                    }
                    break;

                default:
                    break;
            }


           /* //check for constraints
            if (root.constraintGood() || level == 0) {
                level++;
                recursionHelper(builder, level, root.first);
                recursionHelper(builder, level, root.second);
                recursionHelper(builder, level, root.third);
                recursionHelper(builder, level, root.fourth);
            } else {
                builder.append("false");
                String output = builder.toString();
                System.out.println(output);
                return;
            }*/
        }


    }


}
