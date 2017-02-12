import java.util.Map;

public class Node {
    public Map<String, Integer> map;
    public Node first;
    public Node second;
    public Node third;
    public Node fourth;
    public final int[] possibleValues = {1, 2, 3, 4};

    public Node(Map map){
        this.map = map;
        first = new Node(this.map);
        second = new Node(this.map);
        third = new Node(this.map);
        fourth = new Node(this.map);
    }

    //Getters
    public int getA(){
        return this.map.get("A");
    }
    public int getB(){
        return this.map.get("B");
    }
    public int getC(){
        return this.map.get("C");
    }
    public int getD(){
        return this.map.get("D");
    }
    public int getE(){
        return this.map.get("E");
    }
    public int getF(){
        return this.map.get("F");
    }
    public int getG() { return this.map.get("G"); }
    public int getH(){
        return this.map.get("H");
    }

    //Setters
    public void setA(int i){
        this.map.put("A", i);
    }
    public void setB(int i){
        this.map.put("B", i);
    }
    public void setC(int i){
        this.map.put("C", i);
    }
    public void setD(int i){
        this.map.put("D", i);
    }
    public void setE(int i){
        this.map.put("E", i);
    }
    public void setF(int i){
        this.map.put("F", i);
    }
    public void setG(int i){
        this.map.put("G", i);
    }
    public void setH(int i){
        this.map.put("H", i);
    }

    public boolean constraintGood(){
        if(checkAConstraint(this) && checkBConstraint(this) && checkCConstraint(this) &&
                checkDConstraint(this) && checkEConstraint(this) && checkFConstraint(this) &&
                checkGConstraint(this) /*&& checkHConstraint(root)*/){
            return true;
        }
        return false;
    }

    public void endPrint(StringBuilder builder){
        builder.append("false");
        String output = builder.toString();
        System.out.println(output);
    }



    public static boolean checkAConstraint(Node node){
        if(node.getA() > 0){
            return (node.getA() > node.getG() && node.getA() <= node.getH());
        }
        else{
            return true;
        }
    }

    public static boolean checkBConstraint(Node node){
        if(node.getB()>0){
            if (node.getF() > 0 && Math.abs(node.getF() - node.getB()) != 1)
                return false;
        }
        return true;
    }

    public static boolean checkCConstraint(Node node){

        if(node.getC() > 0){
            if (node.getG() > 0 && Math.abs(node.getG() - node.getC()) != 1)
                return false;
            if (node.getH() > 0 && Math.abs(node.getH() - node.getC()) % 2 != 0)
                return false;
            if (node.getD() > 0 && node.getD() == node.getC())
                return false;
            if (node.getE() > 0 && node.getE() == node.getC())
                return false;
            if (node.getF() > 0 && node.getC() == node.getF())
                return false;
        }
        return true;
    }

    public static boolean checkDConstraint(Node node){

        if(node.getD() > 0){
            if (node.getH() > 0 && node.getH() == node.getD())
                return false;
            if (node.getG() > 0 && node.getD() <= node.getG())
                return false;
            if (node.getE() > 0 && node.getE() >= (node.getD() - 1))
                return false;
            if (node.getF() > 0 && node.getD() == node.getF())
                return false;
        }
        return true;
    }

    public static boolean checkEConstraint(Node node){

        if(node.getE() > 0){
            if (node.getH() > 0 && node.getE() == (node.getH() - 2))
                return false;
            if (node.getF() > 0 && Math.abs(node.getE() - node.getF()) % 2 == 0)
                return false;
        }
        return true;
    }

    public static boolean checkFConstraint(Node node){

        if(node.getF() > 0){
            if (node.getG() > 0 && node.getG() == node.getF())
                return false;
            if (node.getH() > 0 && node.getH() == node.getF())
                return false;
        }
        return true;
    }

    public static boolean checkGConstraint(Node node){

        if(node.getG() > 0){
            if (node.getH() > 0 && node.getG() >= node.getH())
                return false;
        }
        return true;
    }

    /*public static boolean checkHConstraint(Node node){
        return false;
    }*/

}
