package BinaryTree;



/*Given the root of a binary tree, return the sum of values of nodes with an even-valued grandparent.
        If there are no nodes with an even-valued grandparent, return 0.*/







public class SumofNodeswithEvenValuedGrandparent {


    // int sum = 0;   // initial sum is 0;

    /* void helper ( TreeNode root) {                     ///   Time Complexity = O(n);


        if ( root == null ) return;

        if ( root.val % 2 == 0 ) {



              if (root.left != null)
              {

                  if (root.left.left != null ) {
                   sum+= root.left.left.val;
                  }

                  if (root.left.right != null ) {
                   sum+= root.left.right.val;
                  }

              }



              if (root.right != null )
              {

                  if (root.right.left != null ) {
                  sum+= root.right.left.val;
                  }

                  if (root.right.right != null ) {
                  sum+ = root.right.right.val;
                  }

               }

        } // first if closed


        helper ( root.left );
        helper ( root.right);




    } */

    /*



    public int SumEvenGrandParent ( TreeNode root ){

        if ( root == null ) return 0;

        helper ( root );
        return sum;
    }



    */
}
