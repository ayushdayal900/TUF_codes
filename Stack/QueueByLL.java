package Stack;

import Stack.StackByLL.StackLL;

public class QueueByLL {
    
    static class Node{

        int data;
        Node next;

        public Node(){

        }

        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    static class  QueueLL {

        Node front;
        Node rear;



        // offer
        public void offer(int x){
            Node newNode = new Node(x);

            if(isEmpty()){
                front = rear = newNode;
                return;
            }

            rear.next = newNode;
            rear = newNode;
        }

        // poll
        public int poll(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int ans = front.data;
            front = front.next;

            if(front == null){
                rear = null;
            }

            return ans;
        }

        // peek
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int ans = front.data;
            return ans;
        }



        // isEmpty
        public boolean isEmpty(){
            return front == null;
        }

    }

    public static void main(String[] args) {
        
        
        QueueLL q  = new QueueLL();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());

        // System.out.println(s.pop());
        // System.out.println(s.pop());
        // System.out.println(s.pop());



    }




}
