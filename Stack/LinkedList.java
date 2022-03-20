public class LinkedList {
    int data;
    LinkedList next;

    LinkedList() {
        data = 0;
        next = null;
    }

    LinkedList(int val) {
        data = val;
        next = null;
    }

    LinkedList(int val, LinkedList node) {
        data = val;
        next = node;
    }
}