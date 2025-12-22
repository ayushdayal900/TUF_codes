package LinkedList;

public class Linked_List_Basics {

    static class Node{

        int data;
        Node next;

        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }

        public Node(int data){
            this.data = data;
            this.next = null;
        }



    }


    public static void main(String[] args) {
        
        int[] nums  = {0,1,2};
        int val = 5;

        Node head = new Node(val);
        Node itr = head;
        for(int i: nums){
            itr.next = new Node(i);
            itr = itr.next;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }


        // size of linked list
        temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        System.out.println();
        System.out.println("Size: "+size);

        // deleting last node
        temp = head;
        while(temp.next != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        temp.next = null;

        // search in a linked list
        temp = head;
        while(temp!= null){
            if(temp.data == 2){
                System.out.println();
                System.out.println("2 is present in linked list.");
                break;
            }
            temp = temp.next;
        }
        
        

        
    }
}
