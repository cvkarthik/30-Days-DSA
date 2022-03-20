class Node {
    int data;
    Node next;
}

class LinkedListCRUD {
    static Node insertNodeAtEnd(int data, Node head) {
        if (head == null) {
            Node newNode = new Node();
            newNode.data = data;
            return newNode;
        }
        Node newdata = new Node();
        newdata.data = data;
        Node headptr = head;
        while (headptr.next != null) {
            headptr = headptr.next;
        }
        headptr.next = newdata;
        return head;
    }

    static void show(Node head) {
        Node headptr = head;
        while (headptr != null) {
            System.out.print(headptr.data + " ");
            headptr = headptr.next;
        }
    }

    static Node insertAtStart(Node head, int data) {
        if (head == null) {
            Node newNode = new Node();
            newNode.data = data;
            return newNode;
        }
        Node startNode = new Node();
        startNode.data = data;
        startNode.next = head;
        return startNode;
    }

    static Node insertAtGivenPosition(Node head, int position, int data) {
        if (head == null) {
            Node newNode = new Node();
            newNode.data = data;
            return newNode;
        }
        if (position == 1 || position < 0) {
            return insertAtStart(head, data);
        }
        int currentpos = 1;
        Node headptr = head;
        while (headptr.next != null) {
            if (currentpos == position - 1) {
                Node newNode = new Node();
                newNode.data = data;
                newNode.next = headptr.next;
                headptr.next = newNode;
                return head;
            }
            headptr = headptr.next;
            currentpos++;
        }
        Node newNode = new Node();
        newNode.data = data;
        headptr.next = newNode;
        return head;
    }

    static Node insertNodeInSortedLL(Node head, int data) {
        if (head == null || data < head.data) {
            Node newNode = new Node();
            newNode.data = data;
            newNode.next = head;
            return newNode;
        }
        Node headptr = head;
        while (headptr.next != null && headptr.next.data < data) {
            headptr = headptr.next;
        }
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = headptr.next;
        headptr.next = newNode;
        return head;
    }

    static Node deleteFirstElemen(Node head) {
        if (head == null || head.next == null)
            return null;
        Node headptr = head.next;
        head.next = null;
        return headptr;
    }

    static Node deleteLastElemen(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node headptr = head;
        while (headptr.next.next != null) {
            headptr = headptr.next;
        }
        headptr.next = null;
        return head;
    }

    static Node deleteNthElement(Node head, int position) {
        if (position == 1) {
            return deleteFirstElemen(head);
        }
        if (head == null) {
            return null;
        }
        int currentpos = 1;
        Node headptr = head;
        while (headptr.next != null && currentpos < position) {
            if (currentpos == position - 1) {
                Node tmp = headptr.next;
                headptr.next = headptr.next.next;
                tmp.next = null;
                break;
            }
            headptr = headptr.next;
            currentpos++;
        }
        return head;
    }

    static Node deleteNodeWithGivenValue(Node head, int value) {
        if (head == null) {
            return null;
        }
        Node headptr = head;
        if (headptr.data == value) {
            Node tmp = headptr;
            headptr = headptr.next;
            tmp.next = null;
            return headptr;
        }
        while (headptr.next != null) {
            if (headptr.next != null && headptr.next.data == value) {
                Node tmp = headptr.next;
                headptr.next = headptr.next.next;
                tmp.next = null;
                return head;
            }
            headptr = headptr.next;
        }
        return head;
    }

    static Node removeDuplicatesFromSortedLL(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node headptr = head;
        while (headptr.next != null) {
            if (headptr.data == headptr.next.data) {
                Node tmp = headptr;
                while (tmp.next != null && tmp.data == tmp.next.data) {
                    tmp = tmp.next;
                }
                headptr.next = tmp.next;
            }
            else{
                headptr = headptr.next;
            }
        }
        return head;
    }

    static void printNthElement(Node head, int position){
        Node headptr = head;
        int pos = 1;
        if(position<1){
            System.out.println("-1");
            return;
        }
        while(headptr.next!=null && pos<position){
            headptr = headptr.next;
            pos++;
        }
        if(pos == position)
            System.out.println(headptr.data);
        else
            System.out.println("-1");
    }

    static void printMiddleElement(Node head){
        Node fastptr = head;
        Node slowptr = head;
        while(fastptr.next!=null && fastptr.next.next!=null){
            fastptr = fastptr.next.next;
            slowptr = slowptr.next;
        }
        System.out.println(slowptr.data);
    }

    static boolean checkIfLLIsSorted(Node head){
        Node headptr = head;
        while(headptr.next!=null && headptr.data < headptr.next.data){
            headptr = headptr.next;
        }
        if(headptr.next == null)
            return true;
        return false;
    }

    static boolean checkIfLLHasALoop(Node head){
        Node slowptr = head;
        Node fastptr = head;
        while(slowptr != null && fastptr!=null && fastptr.next != null){
            slowptr=slowptr.next;
            fastptr = fastptr.next.next;
            if(slowptr == fastptr){
                return true;
            }
        }
        return false;
    }

    // static boolean isPalindrome(Node head){
    //     Node slowptr = head;
    //     Node fastptr = head;
    //     Node prevslowptr = head;
    //     while(fastptr!=null && fastptr.next!=null){
    //         prevslowptr = slowptr;
    //         slowptr = slowptr.next;
    //         fastptr = fastptr.next.next;
    //     }
    // }
    public static void main(String[] args) {
        Node head = new Node();
        head.data = 3;
        head.next = new Node();
        head.next.data = 5;
        head.next.next = new Node();
        head.next.next.data = 6;
        head.next.next.next = new Node();
        head.next.next.next.data = 7;
        head.next.next.next.next = new Node();
        head.next.next.next.next.data = 4;
        // Node res = insertNodeAtEnd(5, null);
        // Node res = insertAtStart(head, 1);
        // Node res = insertAtGivenPosition(head, 3, 5);
        // Node res = insertNodeInSortedLL(head, 6);
        // Node res = deleteFirstElemen(head);
        // Node res = deleteLastElemen(head);
        // Node res = deleteNthElement(head, 8);
        //Node res = deleteNodeWithGivenValue(head, 2);
        //Node res = removeDuplicatesFromSortedLL(head);
        //show(res);
        //printNthElement(head, 0);
        //printMiddleElement(head);
        //System.out.println(checkIfLLIsSorted(head));
        head.next.next.next.next.next = head;
        System.out.println(checkIfLLHasALoop(head));
    }
}
