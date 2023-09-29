package BinaryTree;

/*Print Left View Of BinaryTree*/

public class LeftViewOfBinaryTree {

    /* public void  LeftView ( TreeNode root ) {

        if (root == null) return ;

        Queue < TreeNode > queue = new LinkedList <TreeNode>();

        queue.add(root);

        while ( ! queue.isEmpty()) {

            int n = queue.size();

            for ( int i = 1; i< n; i++) {

                TreeNode temp = queue.poll();

                if ( i == 1) System.out.print( temp.val + " ");             // Tc - O(n) Sc - O(n)

                if (temp.left  !=  null  ) queue.add(temp.left);
                if (temp.right != null )   queue.add(temp.right);


            }

        }

    }*/
}
