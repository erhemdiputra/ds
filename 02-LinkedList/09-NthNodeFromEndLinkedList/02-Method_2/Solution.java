public class Solution {
    Node head;

    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    void printNthFromLast(int n) {
        Node main_ptr = head;
        Node ref_ptr = head;

        int count = 0;
        if (head != null) {
            while(count < n) {
                if(ref_ptr == null) {
                    System.out.println(n + " is greater than no of nodes in the list");
                    return;
                }
                ref_ptr = ref_ptr.next;
                count++;
            }

            while(ref_ptr != null) {
                main_ptr = main_ptr.next;
                ref_ptr = ref_ptr.next;
            }
            System.out.println("Node no. " + n + " from last is " + main_ptr.data);
        }
    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public static void main(String[] args) {
        Solution llist = new Solution();
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(35);

        llist.printNthFromLast(3);
    }



}