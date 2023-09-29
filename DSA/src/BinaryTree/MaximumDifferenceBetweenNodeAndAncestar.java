package BinaryTree;

/*Given the root of a binary tree, find the maximum value v for which there
        exist different nodes a and b where v = |a.val - b.val| and a is an ancestor of b.
        A node a is an ancestor of b if either: any child of a is equal to b or any child of a is an ancestor of b.*/


public class MaximumDifferenceBetweenNodeAndAncestar {

   /*


   public int solve (TreeNode root, int max , int min) {

        if ( root == null) return max-min;

        if ( root.val > max) max = root.val;
        if ( root.val < min) min = root.val;


        return Math.max(solve(root.left , max , min),solve (root.right, max, min)); // Tc - (h)

    }


    public int maxAncestorDiff(TreeNode root) {

        return  solve (root, root.val , root.val);

    }

    */
}
