package LinkedList;

/*

Reverse a Doubly Linked List


Problem Statement: Given a doubly linked list of size ‘N’ consisting of positive integers, 
your task is to reverse it and return the head of the modified doubly linked list.

Input : DLL - 1 <-> 2 <-> 3 <-> 4
Output: DLL - 4 <-> 3 <-> 2 <-> 1


*/


public class Reverse_a_Doubly_Linked_List {

    static class Node{
        int data;
        Node prev;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }


    public static void insertDLL(int[] data, Node head){
        Node t = head;
        for(int i: data){
            Node newNode = new Node(i);
            t.next = newNode;
            newNode.prev = t;
            t = t.next;
        }
    }


    public static void showDll(Node head){
        Node t = head;
        while (t != null) {
            System.out.print(t.data + " --> ");
            t = t.next;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        Node head = new Node(0);
        
        System.out.println("creating a dll:");   
        insertDLL(nums, head);
        
        
        
        // see  dll
        System.out.println("show DLL");   
        showDll(head);

        // Reverse DLL
        Node t = head;
        Node tail = head;
        while(tail.next != null){
            tail = tail.next;
        }

        while(t.prev != tail && t != tail){
            int d = t.data;
            t.data = tail.data;
            tail.data = d;

            t = t.next;
            tail = tail.prev;
        }



        System.out.println("show DLL");   
        showDll(head);


        


    }
}
