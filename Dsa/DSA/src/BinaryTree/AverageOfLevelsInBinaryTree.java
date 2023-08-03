package BinaryTree;



/*


Given the root of a binary tree, return the average value of the nodes on each level in the form of an array.
Answers within 10-5 of the actual answer will be accepted.



*/


public class AverageOfLevelsInBinaryTree {

   /* public List<Double>  AverageOfLevels (TreeNode root) {

        List < Double> ll = new LinkedList<Double>();

        Queue<TreeNode>  queue = new LinkedList<TreeNode>();

        if ( root == null ) {
            return ll;
        }

        queue.add(root);

        while (! queue.isEmpty()) {

            int size = queue.size();

            double sum = 0.0;
            for ( int i=0; i < size; i++) {

                TreeNode node = queue.poll();


                sum += node.val;

                if ( node.left != null ) queue.offer(node.left);
                if ( node.right != null ) queue.offer(node.right);

            }

            ll.add(sum / size);
        }

        return ll;
    }*/


}

