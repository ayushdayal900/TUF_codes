package LinkedList;

public class Sort_a_Linked_List_of_0_1_and_2 {

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }




    public static void main(String[] args) {
        Node head = new Node(0);
        Node t = head;

        int[] nums = {1 , 2 , 0 , 1 , 0 ,2};

        for(int i : nums){
            t.next = new Node(i);
            t = t.next;
        }

        t = head;
        while(t != null){
            System.out.print(t.data + " --> ");
            t = t.next;
        }
        
        Node zeroDummy = new Node(-1);
        Node oneDummy = new Node(-1);
        Node twoDummy = new Node(-1);

        Node zero = zeroDummy;
        Node one = oneDummy;
        Node two = twoDummy;

        t = head;
        while(t != null){
            if(t.data == 0){
                zero.next = new Node(0);
                zero = zero.next;
            }
            else if(t.data == 1){
                one.next = new Node(1);
                one = one.next;
            }
            else{
                two.next = new Node(2);
                two = two.next;
            }
            t = t.next;
        }

        zero.next = oneDummy.next != null ? oneDummy.next : twoDummy.next;
        one.next = twoDummy.next;
        two.next = null;
        head = zeroDummy.next;

        t = head;
        System.out.println();
        while(t != null){
            System.out.print(t.data + " --> ");
            t = t.next;
        }
        

    }
}
