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

    public int GetNth(int index) {
        Node current = head;
        int count = 0;

        while(current != null) {
            if (count == index) {
                return current.data;
            }
            count++;
            current = current.next;
        }

        /* if we get to this line, the caller was asking 
		for a non-existent element so we assert fail */
        assert(false);
        return 0;
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

        System.out.println("Element at index 3 is " + llist.GetNth(3));
    }
}