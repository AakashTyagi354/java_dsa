package BinaryTree;

public class binary_tree {
    static class Node{
        int key;
        Node left;
        Node right;

        Node(int k){
            key = k;
        }
    }
    // inorder trversal
    static void inorder(Node root){
        if(root!= null){
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }
    // preorder traversal
    static void preorder(Node root){
        if(root != null){
            System.out.print(root.key + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    // post order traversal
    static void postorder(Node root){
        if(root != null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.key+" ");
        }
    }
    public static void main(String[] args) {
       Node root = new Node(10);
       root.left = new Node(20);
       root.left.right = new Node(50);
       root.right = new Node(30);
       root.left.left = new Node(40);


        inorder(root);
        preorder(root);
        postorder(root);

    }
}
