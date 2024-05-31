package dsaindividualassignment;

class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void insertAtPos(int data, int position) {
        Node newNode = new Node(data);

        
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        for (int i = 0; current != null && i < position - 1; i++) {
            current = current.next;
        }

        
        if (current == null) {
            System.out.println("Position out of bounds");
            return;
        }

        
        newNode.next = current.next;
        current.next = newNode;
    }
    
    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node temp = head;

        if (position == 1) {
            head = temp.next;
            return;
        }

        for (int i = 1; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Position out of bounds.");
            return;
        }

        Node next = temp.next.next;
        temp.next = next;
    }
    
    public void deleteAfterNode(Node prevNode) {
        if (prevNode == null || prevNode.next == null) {
            System.out.println("The given node is null or there is no node after the given node to delete.");
            return;
        }

        Node nodeToDelete = prevNode.next;
        prevNode.next = nodeToDelete.next;
        nodeToDelete.next = null;
    }
    
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    public Node findNode(int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == value) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    
    public Node searchNode(int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == value) {
                return temp; // Found the node with the specified value
            }
            temp = temp.next;
        }
        return null; // Node with the specified value not found
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtPos(20, 0); 
        list.insertAtPos(60, 1); 
        list.insertAtPos(70, 2); 
        list.insertAtPos(40, 1); 
        list.insertAtPos(50, 3);
         
        
        
        System.out.println("List prior to deleting:");
        list.printList();
        
        
        list.deleteAtPosition(4);
        System.out.println("List after deleting node at position 4:");
        list.printList();
        
        
    
        Node node = list.findNode(20);
        
        
        list.deleteAfterNode(node);
        System.out.println("List after deleting the node after 20:");
        list.printList();
        
        
        node = list.findNode(50);
        list.deleteAfterNode(node);
        System.out.println("List after attempting to delete node after 50:");
        list.printList();
        
        Node foundNode = list.searchNode(20);
        if (foundNode != null) {
            System.out.println("Node with value 20 found.");
        } else {
            System.out.println("Node with value 20 not found.");
        }
        
        foundNode = list.searchNode(80);
        if (foundNode != null) {
            System.out.println("Node with value 80 found.");
        } else {
            System.out.println("Node with value 80 not found.");
        }

    }
}

