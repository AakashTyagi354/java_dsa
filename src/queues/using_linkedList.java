package queues;

public class using_linkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null & tail == null;
        }

        // add
        public static void add(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // Remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is full");
                return -1;
            }
            int front = head.data;

            // single element
            if(tail == head){
                tail = head = null;
            }else{
                head = head.next;
            }
            return front;
        }

        // peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("queue is full");
                return -1;
            }
            return head.next.data;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(10);
        q.add(20);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
