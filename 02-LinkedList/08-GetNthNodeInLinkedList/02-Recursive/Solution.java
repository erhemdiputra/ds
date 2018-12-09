class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class Solution {
    Node head;

    public int GetNth(Node head, int index) {
        if (index == 0) {
            return head.data;
        }

        return GetNth(head.next, index-1);
    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public static void main(String[] args) {
        Solution llist = new Solution();

        llist.push(1);
        llist.push(4);
        llist.push(1);
        llist.push(12);
        llist.push(1);

        // 1 -> 12 -> 1 -> 4 -> 1
        System.out.println("Element at index 3 is " + llist.GetNth(llist.head, 3));
    }
}