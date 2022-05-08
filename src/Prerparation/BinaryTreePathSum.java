package Prerparation;

// Java program to print
// root to leaf path sum
// equal to a given number

/* A binary tree node has data,
pointer to left child
and a pointer to right child */
class Node2 {
    int data;
    Node2 left, right;

    Node2(int item)
    {
        data = item;
        left = right = null;
    }
}

class BinaryTreePathSum {

    Node2 root;

	/*
	Given a tree and a sum,
	return true if there is a path
	from the root down to a leaf,
	such that adding up all
	the values along the path
	equals the given sum.

	Strategy: subtract the node
	value from the sum when
	recurring down, and check to
	see if the sum is 0 you reach the leaf node.
	*/

    boolean hasPathSum(Node2 node, int sum)
    {
        boolean ans = false;
        int subSum = sum - node.data;
        if(subSum == 0 && node.left == null && node.right == null)
            return(ans = true);
        if(node.left != null)

            // ans || hasPathSum... has no utility if the ans is false
            ans = ans || hasPathSum(node.left, subSum);

        if(node.right != null)

            // But if it is true then we can avoid calling hasPathSum
            // here as answer has already been found
            ans = ans || hasPathSum(node.right, subSum);
        return(ans);
    }

    // Driver Code
    public static void main(String args[])
    {
        int sum = 21;

		/* Constructed binary tree is
			10
			/ \
		8	 2
		/ \ /
		3 5 2
		*/
        BinaryTreePathSum tree = new BinaryTreePathSum();
        tree.root = new Node2(10);
        tree.root.left = new Node2(8);
        tree.root.right = new Node2(2);
        tree.root.left.left = new Node2(3);
        tree.root.left.right = new Node2(5);
        tree.root.right.left = new Node2(2);

        if (tree.hasPathSum(tree.root, sum))
            System.out.println(
                    "There is a root to leaf path with sum "
                            + sum);
        else
            System.out.println(
                    "There is no root to leaf path with sum "
                            + sum);
    }
}


