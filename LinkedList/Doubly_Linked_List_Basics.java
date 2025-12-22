package LinkedList;

public class Doubly_Linked_List_Basics {

    static class Node {
        
        int data;
        Node prev, next;

        public Node(int data){
            this.data = data;
        }
        
    }

    public static void printForward(Node head){
        // forward printing

        Node t = head;
        System.out.println("Forward Printing");
        while(t != null){
            System.out.print(t.data + " --> ");
            t = t.next;
        }
        System.out.println();
    }

    public static void printBackward(Node head){
        Node t = head;
        System.out.println();
        System.out.println("Backward Printing");
        while(t.next != null){
            t = t.next;
        }
        while(t != null){
            System.out.print(t.data + " --> ");
            t = t.prev;
        }
        System.out.println();
    }


    public static void insertTail(Node head){
        Node t = head;
        while(t.next != null){
            t = t.next;
        }

        Node newNode = new Node(6);
        t.next = newNode;
        newNode.prev = t;
        t = newNode;

        printForward(head);
        printBackward(head);
    }


    public static void deleteNode(Node head, int n){
        Node curr = head;
        while(curr != null){

            if(curr.data == n){
                // head
                if(curr.prev == null){
                    head = curr.next;
                    if(head != null){
                        head.prev = null;
                    }
                    curr.next = null;
                }else{
                    curr.prev.next = curr.next;
                    if(curr.next != null){
                        curr.next.prev = curr.prev;
                    }
                    curr.next = null;
                    curr.prev = null;
                }
                break;
            }
            curr = curr.next;
        }
        printForward(head);
    }

    public static void main(String[] args) {
        Node head = new Node(0);
        
        Node t = head;

        // inserting in doubly linked list
        int[] nums = {1,2,3,4,5};

        for(int i: nums){
            Node newNode = new Node(i);
            t.next = newNode;
            newNode.prev = t;
            t = newNode;
        }

        // forward printing
        printForward(head);
        
        // backward Printing
        printBackward(head);

        // insert at tail
        insertTail(head);


        // deleting a node in dll
        int n = 3;
        deleteNode(head, n);

        


    }
}
