package BinaryTree;

public class ConstructBinaryTreePreorderInorder {


    /*

    static  Map <Integer,Integer> map= new HashMap<Integer,Integer>();



    public TreeNode buildTree(int[] preorder, int[] inorder) {           //       Tc -     O(h)



        for (int i=0; i<inorder.length; i++ ) {

            map.put (inorder[i],i);
        }


        TreeNode root= Helper(preorder ,0 , preorder.length-1, inorder, 0, inorder.length-1);

        return root;

    }

    public TreeNode Helper(int [] preorder , int prestart , int preend , int[] inorder , int instart , int inend ) {

        if ( prestart > preend || instart > inend ) return null;

        TreeNode root = new TreeNode ( preorder [prestart]);

        int inroot = map.get(root.val);
        int numsleft = inroot-instart;

        root.left = Helper (preorder, prestart+1 , prestart+numsleft, inorder , instart , inroot-1);
        root.right = Helper (preorder, prestart+numsleft+1 , preend, inorder, inroot+1, inend);

        return root;
    }


}*/
}