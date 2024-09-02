import java.util.Scanner;

public class LinkedListSample {

    static Scanner scanner = new Scanner(System.in);
    public class Node {
        int data;
        Node next;

        public Node () {
            next = null;
        }
    }
    Node head = null;

    public void mainLoop() {
        String chosenOp;
        System.out.println("(i)nsert front node, i(n)sert back node, in(s)ert between nodes");
        System.out.println("(d)elete front node, d(e)lete back node, de(l)ete between nodes");
        System.out.println("(t)raverse, e(x)it\nChoose:");
        chosenOp = scanner.nextLine();

        while (chosenOp != "x") {
            switch (chosenOp) {
                case "i" : {
                    insertFrontNode();
                    break; }
                case "n" : {
                    insertBackNode();
                    break; }
                case "s" : {
                    insertBetweenNodes();
                    break; }
                case "d" : {
                    deleteFrontNode();
                    break; }
                case "e" : {
                    deleteBackNode();
                    break; }
                case "l" : {
                    deleteBetweenNodes();
                    break; }
                case "t" : {
                    traverse();
                    break; }
                default:
                    System.out.println("Invalid input!");
            }
            System.out.println("(i)nsert front node, i(n)sert back node, in(s)ert between nodes");
            System.out.println("(d)elete front node, d(e)lete back node, de(l)ete between nodes");
            System.out.println("(t)raverse, e(x)it\nChoose:");
            chosenOp = scanner.nextLine();
        }
    }

    public void traverse() {
        Node temp = new Node();
        temp = head;
        while (temp != null) {
            System.out.println("\t\t|" + temp.data + "|");
            temp = temp.next;
        }
    }

    public void insertFrontNode() {
        Node head2 = new Node();
        System.out.println("Enter a number: ");
        head2.data = scanner.nextInt();
        if (head == null) {
            head2.next = null;
        } else {
            head2.next = head;
        }
        head = head2;
    }

    public void insertBackNode() {
        Node tail = new Node();
        Node temp = new Node();
        System.out.println("Enter a number: ");
        tail.data = scanner.nextInt();
        tail.next = null;
        if (head == null) {
            head = tail;
        } else {
            temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = tail;
        }

    }

    public void insertBetweenNodes() {
        Node body = new Node();
        Node temp = new Node();
        int position;
        System.out.println("Enter a number: ");
        body.data = scanner.nextInt();
        System.out.println("Insert at position: ");
        position = scanner.nextInt();
        if (position > 0){
            temp = head;
            for (int i = 1; i < position; i++){
                temp = temp.next;
            }
            body.next = temp.next;
            temp.next = body;
        }
    }

    public void deleteFrontNode() {
        Node temp = new Node();
        temp = head;
        head = head.next;
    }

    public void deleteBackNode() {
        Node tail = new Node();
        Node temp = new Node();
        temp = head;
        while (temp.next != null) {
            tail = temp;
            temp = temp.next;
        }
        tail.next = null;
    }

    public void deleteBetweenNodes() {
        Node body = new Node();
        Node temp = new Node();
        int position;
        System.out.println("Delete at position: ");
        position = scanner.nextInt();
        if (position > 0) {
            temp = head;
            for (int i = 1; i < position; i++) {
                body = temp;
                temp = temp.next;
            }
            body.next = temp.next;
        }
    }

    public static void main(String[] args) {
        String isQuit;
        LinkedListSample t = new LinkedListSample();
        System.out.println("Press [1] to quit, any to enter");
        isQuit = scanner.nextLine();
        while (!isQuit.equals("1")) {
            t.mainLoop();
            System.out.println("Press [1] to quit, any to enter");
            isQuit = scanner.nextLine();
        }
        System.out.println("Program end");
    }
}

