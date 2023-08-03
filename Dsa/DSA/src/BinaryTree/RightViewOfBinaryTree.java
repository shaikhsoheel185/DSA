package BinaryTree;

public class RightViewOfBinaryTree {

    /*

    public List<Integer> rightSideView(TreeNode root) {

        List< Integer > list = new LinkedList < Integer > ();

        if (root == null) return list;

        Queue < TreeNode > queue = new LinkedList < TreeNode > ();

        queue.add (root);

        while ( !queue.isEmpty() ) {

            int size = queue.size();

            for (int i=0; i< size; i++) {

                TreeNode temp = queue.poll();

                if ( i == size-1){

                    list.add(temp.val);
                }

                if ( temp.left != null) queue.add(temp.left);                  // TimeComplexity - O(n);
                if ( temp.right != null) queue.add(temp.right);                // SpaceComplexity - O(n); - stack space


            }
        }

        return list;
    }

    */
}
