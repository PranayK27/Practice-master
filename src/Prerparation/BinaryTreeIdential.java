package Prerparation;

// Java program to see if two trees are identical

// A binary tree node
class Node1
{
    int data;
    Node1 left, right;

    Node1(int item)
    {
        data = item;
        left = right = null;
    }
}

class BinaryTreeIdentical
{
    Node1 root1, root2;

    /* Given two trees, return true if they are
    structurally identical */
    boolean identicalTrees(Node1 a, Node1 b)
    {
        /*1. both empty */
        if (a == null && b == null)
            return true;

        /* 2. both non-empty -> compare them */
        if (a != null && b != null)
            return (a.data == b.data
                    && identicalTrees(a.left, b.left)
                    && identicalTrees(a.right, b.right));

        /* 3. one empty, one not -> false */
        return false;
    }

    /* Driver program to test identicalTrees() function */
    public static void main(String[] args)
    {
        BinaryTreeIdentical tree = new BinaryTreeIdentical();

        tree.root1 = new Node1(1);
        tree.root1.left = new Node1(2);
        tree.root1.right = new Node1(3);
        tree.root1.left.left = new Node1(4);
        tree.root1.left.right = new Node1(5);

        tree.root2 = new Node1(1);
        tree.root2.left = new Node1(2);
        tree.root2.right = new Node1(3);
        tree.root2.left.left = new Node1(4);
        tree.root2.left.right = new Node1(5);

        if (tree.identicalTrees(tree.root1, tree.root2))
            System.out.println("Both trees are identical");
        else
            System.out.println("Trees are not identical");

    }
}

