package BinaryTree;

public class build_tree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTre{
        static int idx = -1;
        public static Node buildTre(int node[]){
            idx++;
            if(node[idx] == -1){
                return null;
            }
            Node newNode = new Node(node[idx]);
            newNode.left = buildTre(node);
            newNode.right = buildTre(node);

            return newNode;
        }

    }
    public static void main(String[] args) {
       int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
       BinaryTre tree = new BinaryTre();
       Node root = tree.buildTre(node);
        System.out.println(root.data);
    }
}
