package JavaChallenges.BinarySearchTreeExample;

import java.util.List;

public class NodeP {
    private String gtin;
    private List<Product> data;
    private NodeP left;
    private NodeP right;

    public NodeP(String gtin, List<Product> data) {
        this.gtin = gtin;
        this.data = data;
    }

    public String getGtin() {
        return gtin;
    }

    public void setGtin(String gtin) {
        this.gtin = gtin;
    }

    public List<Product> getData() {
        return data;
    }

    public void setData(List<Product> data) {
        this.data = data;
    }

    public NodeP getLeft() {
        return left;
    }

    public void setLeft(NodeP left) {
        this.left = left;
    }

    public NodeP getRight() {
        return right;
    }

    public void setRight(NodeP right) {
        this.right = right;
    }

}
