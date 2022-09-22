package BinaryTree;

public class binary_tree_height {
    static class Node{
        int key;
        Node left;
        Node right;

        Node(int k){
            key = k;
        }
    }
    static int height(Node root){
        if(root == null){
            return 0;
        }else {
            return Math.max(height(root.left),height(root.right))+1;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right=  new Node(50);
        root.right.right.left = new Node(70);

        System.out.println(height(root));
    }
}
