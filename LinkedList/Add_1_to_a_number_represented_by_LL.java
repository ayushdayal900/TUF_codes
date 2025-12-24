package LinkedList;


/*
Add 1 to a number represented by LL



1

Problem Statement: Given the head of a singly linked list representing a positive integer number. Each node of the linked list represents a digit of the number, with the 1st node containing the leftmost digit of the number and so on. The task is to add one to the value represented by the linked list and return the head of a linked list containing the final value.

The number will contain no leading zeroes except when the value represented is zero itself.

Examples
Input: 4->5->6

Output: 4->5->7
Explanation: 456 + 1 = 457
Input: 9->9->9

Output: 1->0->0->0
Explanation: 999 + 1 = 100

*/

public class Add_1_to_a_number_represented_by_LL {

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

        // int[] nums = {4,5,7};
        int[] nums = {9,9,9};

        for(int i : nums){
            t.next = new Node(i);
            t = t.next;
        }

        head = head.next;
        t = head;
        while(t != null){
            System.out.print(t.data + " --> ");
            t = t.next;
        }
        System.out.println();




        // reversing this ll

        Node curr = head;
        Node prev = null;

        while(curr != null){
            Node nextNode = curr.next;

            curr.next = prev;

            prev = curr;
            curr = nextNode;
        }

        head = prev;
        t = head;
        while(t != null){
            System.out.print(t.data + " --> ");
            t = t.next;
        }



        t = head;
        // carry
        int c = 0;
        int sum = t.data + 1 + c;
        if(sum > 9){
            t = t.next;
            sum = t.data + c;            
            while(t != null){
                c = sum /10;
                if(sum < 10){
                    t.data = sum;
                    break;
                }

                t = t.next;
            }
        }
        t = head;
        System.out.println();
        System.out.println("After adding carry : ");
        while(t != null){
            System.out.print(t.data + " --> ");
            t = t.next;
        }



       


    }
}
