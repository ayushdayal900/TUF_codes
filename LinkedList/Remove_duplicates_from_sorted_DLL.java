package LinkedList;

public class Remove_duplicates_from_sorted_DLL {

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

        int[] nums = {1,1,1,4,10,10,10,60,60,90};  
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



        // delete duplicates

        t = head;

        // this is the correct code.
        // while( t != null && t.next != null){
            
        //     // check for duplicate
        //     if(t.data == t.next.data){
        //         Node dup = t.next;
        //         t.next = dup.next;
        //         if(dup.next != null){
        //             dup.next.prev = t;
        //         }
        //     }else{
        //         t = t.next;
        //     }
        // }



        // this code may generate errors.
        while(t.next != null){
            Node contra = t.next;
            while(t.data == contra.data){
                contra = contra.next;
                if(contra == null){
                    t.next = null;
                    break;
                }
            }
            t.next = contra;
            contra.prev = t;
            t = contra;
        }

        System.out.println();
        t = head;
        while(t != null){
            System.out.print(t.data + " --> ");
            t = t.next;
        }

    }
}
