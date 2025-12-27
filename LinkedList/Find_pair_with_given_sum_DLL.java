package LinkedList;

import java.util.ArrayList;

public class Find_pair_with_given_sum_DLL {

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
        
        // int[] nums = {10,4,10,6,10,10};  
        int[] nums = {1, 2, 3, 4, 9};  
        int sum = 5;


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

        Node si = head;
        Node ei = head;

        while(ei.next != null){
            ei = ei.next;
        }   

        ArrayList<int[]> al = new ArrayList<>();

        while(si != ei && si.prev != ei){
            // check sum
            int total = si.data + ei.data;
            if( total == 5){
                al.add(new int[] {si.data, ei.data});
                si = si.next;
                ei = ei.prev;
            }else if( total < 5){
                si = si.next;
            }else{
                ei = ei.prev;
            }
        }

        System.out.println("Pairs");
        int k = 0;
        for(int[] a : al){
            k++;
            System.out.print("pair - " + k);
            for(int i: a){
                System.out.print("   "+i+" , ");
            }
            System.out.println();
        }
    }
}
