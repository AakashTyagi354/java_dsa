package BinaryTree;

public class traverse_tree {
    static class Node{
        int data;
        build_tree.Node left;
        build_tree.Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTre{
        static int idx = -1;
        public static build_tree.Node buildTre(int node[]){
            idx++;
            if(node[idx] == -1){
                return null;
            }
            build_tree.Node newNode = new build_tree.Node(node[idx]);
            newNode.left = buildTre(node);
            newNode.right = buildTre(node);

            return newNode;
        }
//        public static void preorder(Node root){
//            if(root == null){
//                return;
//            }
//            System.out.print(root.data+" ");
//            preorder(root.left);
//            preorder(root.right);
//
//        }
    }


    public static void main(String[] args) {
        int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        build_tree.BinaryTre tree = new build_tree.BinaryTre();
        build_tree.Node root = tree.buildTre(node);



    }
}
