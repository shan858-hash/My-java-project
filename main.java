import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    //start
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println("Inserted " + data + " at the beginning.");
    }

   //end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            System.out.println("Inserted " + data + " at the end.");
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        System.out.println("Inserted " + data + " at the end.");
    }

    //delete
    public void delete(int key) {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }

        if (head.data == key) {
            head = head.next;
            System.out.println("Deleted " + key + " from the list.");
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != key) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            System.out.println("Deleted " + key + " from the list.");
        } else {
            System.out.println("Value " + key + " not found in the list.");
        }
    }

    //serch
    public boolean search(int key) {
        Node temp = head;
        int position = 1;
        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Value " + key + " found at position " + position + ".");
                return true;
            }
            temp = temp.next;
            position++;
        }
        System.out.println("Value " + key + " not found in the list.");
        return false;
    }

    //disply
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        System.out.print("List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();
        int choice, value;

        while (true) {
            System.out.println("\n--- operation List ---");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Delete a Value");
            System.out.println("4. Search a Value");
            System.out.println("5. Display List");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
                continue;
            }

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter integer to insert at beginning: ");
                    value = scanner.nextInt();
                    list.insertAtBeginning(value);
                    break;

                case 2:
                    System.out.print("Enter integer to insert at end: ");
                    value = scanner.nextInt();
                    list.insertAtEnd(value);
                    break;

                case 3:
                    System.out.print("Enter integer to delete: ");
                    value = scanner.nextInt();
                    list.delete(value);
                    break;

                case 4:
                    System.out.print("Enter integer to search: ");
                    value = scanner.nextInt();
                    list.search(value);
                    break;

                case 5:
                    list.display();
                    break;

                case 6:
                    System.out.println("Exiting application.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Choose a option between 1 and 6.");
            }
        }
    }
}