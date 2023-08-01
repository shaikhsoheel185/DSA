package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

    /*2. Given a binary tree
            struct Node {
            int val;
            Node *left;
            Node *right;
            Node *next;
            }
            Populate each next pointer to point to its next right node. If there is no next right node,
            the next pointer should be set to NULL. Initially, all next pointers are set to NULL.    */


public class ConnectNodesInBinaryTree {

  /*

       public Node Connect (Node root) {

        Queue <Node> queue= new LinkedList<Node>();

        if ( root == null ) {
            return root;
        }

        queue.offer(root);

        while ( ! queue.isEmpty() ) {

            int size = queue.size();

            for ( int i =0; i< size; i++) {

                Node curr = queue.poll();

                if (0 < size -1) {
                    curr.next = queue.poll();
                }

                if (curr.left != null) queue.offer(curr.left);
                if (curr.righ != null) queue.offer(curr.right);                 // Tc - O(n)
                                                                                // SC - O(n)

            }

        }
        return root;
    }


    */
}
