package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.append(5);
        ll.append(6);
        ll.printAll();
        // System.out.println(ll.findKthNodeFromEnd(5).value);
        System.out.println(ll.removeKthElementFromEnd(2).value);
        ll.printAll();
    }
}
