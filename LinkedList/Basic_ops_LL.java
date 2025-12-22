package LinkedList;

/*

Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.


Example 1:

Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.


*/



public class Basic_ops_LL {

    static class  Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }

    public static void insert(int[] data, Node head){
        Node t = head;

        for(int d: data){
            Node newNode = new Node(d);
            t.next = newNode;
            t = t.next;
        }
    }

    public static void show(Node head){
        Node t = head;

        while(t != null){
            System.out.print(t.data + " --> ");
            t = t.next;
        }
    }


    public static void middleElement(Node head){
        Node slow = head;
        Node fast = head;
        System.out.println();
        System.out.print("middle element is : ");
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }


    // iterative reverse
    public static Node reverseLL_itr(Node head){
        System.out.println("Reverse LL Iterative:");
        if(head == null || head.next == null){
            return head;
        }

        Node curr = head;
        Node prev = null;

        while(curr != null){
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        return prev;
    }


    // recursive reverse
    public static Node reverseLL_rec(Node head) {
    // Base case: if list is empty or has only one node
    
    if (head == null || head.next == null)
        return head;
    // Recursively reverse the rest of the list
    Node newHead = reverseLL_rec(head.next);
    // Store reference to next node
    head.next.next = head;
    // Break original forward link
    head.next = null;
    // Return new head of reversed list
    return newHead;
}

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        Node head = new Node(0);
        insert(nums, head);
        show(head);
        middleElement(head);

        Node rev = reverseLL_itr(head);
        show(rev);

        System.out.println();
        System.out.println("Reverse LL Recursive");
        rev = reverseLL_rec(rev);
        show(rev);

        

    }
}
