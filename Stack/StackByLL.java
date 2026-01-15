package Stack;

public class StackByLL {

    static class Node{

        int data;
        Node next;

        public Node(){

        }

        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    
    static class StackLL{
        Node head = new Node();
        Node top = head;

        // push
        public void push(int x){
            Node newNode = new Node(x);
            top.next = newNode;
            top = newNode;
        }

        // pop
        public int pop(){

            if(isEmpty()){
                System.out.println("Stack Is Empty");
                return -1;
            }

            Node prev = head;
            while(prev.next != top){
                prev = prev.next;
            }
            int ans = top.data;
            top = prev;
            top.next = null;
            return ans;
        }

        // peek
        public int peek(){
            if(isEmpty()){
                System.out.println("Stack Is Empty");
                return -1;
            }
            return top.data;
        }

        // isEmpty
        public boolean isEmpty(){
            return head.next == null;
        }

    }


    public static void main(String args[]){


        StackLL s  = new StackLL();
        s.push(10);
        s.push(20);
        s.push(30);

        
        
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        




    }
}
