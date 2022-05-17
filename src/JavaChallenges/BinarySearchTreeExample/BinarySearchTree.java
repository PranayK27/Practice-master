package JavaChallenges.BinarySearchTreeExample;

import java.util.List;

class TreeP{

    private NodeP root;

    public void insert(String gtin, List<Product> data){

        NodeP newNode = new NodeP(gtin, data);

        if (root == null){
            root = newNode;
        }
        else {
            NodeP current = root;
            NodeP parent;
            while (true){
                parent = current;
                if (gtin.compareTo(current.getGtin()) < 0){
                    current = current.getLeft();
                    if (current == null){
                        parent.setRight(newNode);
                        return;
                    }
                } else
                    return; //already exists
            }
        }
        return;
    }


    public NodeP find(String gtin) {
        NodeP current = root;
        if (current == null) {
            return null;
        }
        while (!current.getGtin().equals(gtin)) {
            if (gtin.compareTo(current.getGtin()) < 0) {
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
            if (current == null)
                return null;
            return current;
        }
        return current;
    }
}

public class BinarySearchTree {

}
