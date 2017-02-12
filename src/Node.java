import java.util.Map;

public class Node {
    Map<String, Integer> map;
    Node first;
    Node second;
    Node third;
    Node fourth;

    public Node(Map map){
        this.map = map;
        first = null;
        second = null;
        third = null;
        fourth = null;
    }

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
    public int getG(){
        return this.map.get("G");
    }
    public int getH(){
        return this.map.get("H");
    }


    public static boolean constraintGood(Node root, int level){
        if(checkAConstraint(root) && checkBConstraint(root) && checkCConstraint(root) &&
                checkDConstraint(root) && checkEConstraint(root) && checkFConstraint(root) &&
                checkGConstraint(root) && checkHConstraint(root)){
            return true;
        }
        return false;
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

    public static boolean checkHConstraint(Node node){
        return false;
    }

}
