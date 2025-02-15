class Node {
    int data;
    Node next;
    Node previous; // Add previous pointer

    Node(int data) {
        this.data = data;
        this.next = null;
        this.previous = null; // Initialize previous pointer
    }
}

class LinkedList {
    Node head;

    LinkedList() {
        this.head = null;
    }

    void insertAfter(Node node, int newData) {
        if (node == null) {
            System.out.println("The given previous node must be in the LinkedList.");
            return;
        }

        Node newNode = new Node(newData);
        Node next = node.next;
        newNode.next = next;
        newNode.previous = node;
        node.next = newNode;
        if (next != null) {
            next.previous = newNode;
        }
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("None");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(4);
        Node second = new Node(1);
        Node third = new Node(5);

        list.head.next = second;
        second.previous = list.head;
        second.next = third;
        third.previous = second;

        System.out.println("Original list:");
        list.printList();

        list.insertAfter(second, 7);

        System.out.println("List after insertion:");
        list.printList();
    }
}