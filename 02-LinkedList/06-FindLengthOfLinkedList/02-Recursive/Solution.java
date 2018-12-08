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

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public int getCountRec(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + getCountRec(node.next);
    }

    public int getCount() {
        return getCountRec(head);
    }

    public static void main(String[] args) {
        Solution llist = new Solution();
        llist.push(1);
        llist.push(3);
        llist.push(1);
        llist.push(2);
        llist.push(1);

        System.out.println("Count of nodes is " + llist.getCount());
    }
}