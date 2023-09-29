package BinaryTree;


 /*A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence has an edge connecting them.
  A node can only appear in the sequence at most once. Note that the path does not need to pass through the root.
  The path sum of a path is the sum of the node's values in the path. Given the root of a binary tree, return the maximum path sum of any non-empty path.*/

public class MaximumPathSumOfBinaryTree {



   /*

    int max = Integer.Min_Value;

   public int MaxPathSum( TreeNode root ) {

        Helper( root );
        return max;
    }

    public int Helper ( root ) {                                                      /// Tc- O(n);  // Sc- (n)

    if (root == null) return Integer.Min_Value;

    int Left = Math.max  ( 0 , Helper ( root.left ) );
    int right = Math.max ( 0 , Helper ( root. right ) );

    max = Math.max ( max , root.val + Left + right );

    return Math.max ( Left , right ) + root.val;



    }






    */
}
