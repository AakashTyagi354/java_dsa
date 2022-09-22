package BinaryTree;

public class find_the_node_at_distance_k {
    static class Node{
        int key;
        Node left;
        Node right;

        Node(int k){
            key = k;
        }
    }
    static void printKDist(Node root,int k ){
        if(root == null){
            return;
        }
        if(k == 0){
            System.out.println(root.key+" ");
        }else{
            printKDist(root.left,k-1);
            printKDist(root.right,k-1);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right=  new Node(50);
        root.right.right.left = new Node(70);
        printKDist(root,1);

    }
}
