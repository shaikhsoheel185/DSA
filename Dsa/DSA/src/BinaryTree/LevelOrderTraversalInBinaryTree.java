package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


/*Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level*/



class LevelOrderTraversalInBinaryTree {
    static class Node {
        int val;
        Node left, right;

        public Node(int data) {
            this.val = val;
        }
    }



    public static List<List<Integer>> levelOrder(Node root) {

        List<List<Integer>> wraplist = new LinkedList ();

        Queue <Node> queue = new LinkedList <Node> ();

        if ( root == null ) {
            return wraplist;
        }

        queue.offer(root);

        while (!queue.isEmpty()) {

            List<Integer> sublist = new ArrayList<> ();            // Tc - O(N);
            // Sc - O(N);

            int levelNum = queue.size ();

            for (int i=0; i< levelNum; i++) {

                if (queue.peek().left != null) {
                    queue.offer(queue.peek().left);
                }
                if (queue.peek().right != null) {
                    queue.offer(queue.peek().right);
                }
                System.out.print(queue.peek().val);
                sublist.add(queue.poll().val);

            }

            wraplist.add (sublist);
        }
        return wraplist;
    }


}
































