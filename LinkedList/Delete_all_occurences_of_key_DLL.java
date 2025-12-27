package LinkedList;


public class Delete_all_occurences_of_key_DLL {

    static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev= null;
        }

    }





    public static void main(String[] args) {
        int[] nums = {10,4,10,6,10,10};  
        Node head = new Node(0);

        Node t = head;
        for(int i : nums){
            Node newNode = new Node(i);
            t.next = newNode;
            newNode.prev = t;
            t = newNode;
        }
        
        head.next.prev = null;
        head = head.next;

        t = head;
        while(t != null){
            System.out.print(t.data + " --> ");
            t = t.next;
        }

        t = head;
        System.out.println();
        System.out.println("deleting duplicate nodes");
        System.out.println();

        while(t != null){

            if(t.data == 10){



                // first node
                if(t.prev == null){
                    head = t.next;
                    if(head != null){
                        head.prev= null;
                    }       
                }

                // middle or tail
                else{
                    t.prev.next = t.next;
                    if(t.next != null){
                        t.next.prev = t.prev;
                    }
                }
            }

            t = t.next;

        }

        t = head;
        while(t != null){
            System.out.print(t.data + " --> ");
            t = t.next;
        }


    }
}
