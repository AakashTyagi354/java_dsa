package stacks;

public class stack_using_linkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;

        }
    }
    static class stack{
        static Node head = null;

        // empty
        public static boolean isEmpty(){
            if(head == null){
                return true;
            }
            return false;
        }

        // push
        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;


        }

        // pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;

            return top;
        }

        //peek;
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
      stack s = new stack();
        s.push(10);
        s.push(20);
        s.push(40);

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
