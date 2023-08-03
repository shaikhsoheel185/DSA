package BinaryTree;

/*Given a binary tree, where every node value is a Digit from 1-9
        Find the sum of all the numbers which are formed from root to leaf paths.*/





public class SumOfAllRootToLeafPaths {

    /*


    int PathSum (TreeNode root,int val) {                     // Time Complexity - O(n); // Space - O(n) - stack space

        if ( root == null) return  0;

        val =  (val * 10 + root.data);

        if (root.left == null && root.right == null) return val;


       int left  = PathSum( root.left , val);
       int right = PathSum( root.right, val);

       return left+right;

    }


    */


    /*

    int TreePathSum ( TreeNode root ) {

    return PathSum(root , 0);
    }



    */
}
