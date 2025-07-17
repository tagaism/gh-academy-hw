package LinkedList;
public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.printf("%d->", temp.value);
            temp = temp.next;
        }
        System.out.println();
    }

    /**
        * Prints the current state of the linked list, including the head, tail, length,
        * and all elements in the list. If the list is empty, it indicates that the
        * head and tail are null and that the list is empty.
        */
    public void printAll() {

        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }
    
    /**
     * Empties the linked list by setting the head and tail to null and resetting the length to 0.
     */
    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    /**
        * Appends a new node with the given value to the end of the linked list.
        *
        * @param value The value to be added to the end of the list.
        */
    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    /**
        * Removes the last node from the linked list.
        * If the list is empty, returns null.
        * If the list contains only one element, both head and tail are set to null.
        * @return The removed node, or null if the list was empty.
        */
    public Node removeLast() {
        if (length == 0) return null;
        Node temp = head;
        Node pre = head;
        while(temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    /**
        * Adds a new node with the given value to the beginning of the linked list.
        *
        * @param value The integer value to be added to the beginning of the list.
        */
    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
            tail = null;
        }
        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        for(int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value)  {
        if (index < 0 || index > length) return false;
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }
    
    /**
     * Removes and returns the node at the specified index in the linked list.
     *
     * @param index the position of the node to remove
     * @return the removed {@link Node} if the index is valid; {@code null} otherwise
     */
    public Node remove(int index) {
        if(index < 0 || index > length) return null;
        if(index == 0) {
            return removeFirst();
        }
        if(index == length) {
            return removeLast();
        }
        Node preremoved = get(index-1);
        Node removed = preremoved.next;
        preremoved.next = removed.next;
        removed.next = null;
        length--;
        return removed;
    }

    /**
     * Reverses the order of the nodes in the linked list.
     * <p>
     * After calling this method, the head of the list will become the tail and vice versa.
     * The operation is performed in-place and has a time complexity of O(n), where n is the length of the list.
     * </p>
     */
    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for(int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    /**
     * Finds and returns the middle node of the linked list.
     * If the list is empty, returns null.
     * 
     * The method uses two pointers: a slow pointer that moves one step at a time,
     * and a fast pointer that moves two steps at a time. When the fast pointer
     * reaches the end of the list, the slow pointer will be at the middle node.
     * 
     * @return The middle node of the linked list, or null if the list is empty.
     */
    public Node findMiddleNode() {
        if(head == null) {
            return null;
        }
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    /**
     * Determines whether the linked list contains a loop (cycle).
     * <p>
     * This method uses Floyd's Cycle-Finding Algorithm (also known as the
     * "tortoise and hare" algorithm) to detect if there is a cycle in the list.
     * It advances two pointers at different speeds through the list; if they
     * ever meet, a loop exists.
     * </p>
     *
     * @return {@code true} if the linked list contains a loop; {@code false} otherwise.
     */
    public boolean hasLoop() {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }

    public Node findKthNodeFromEnd(int k) {
        Node fast = head;
        Node slow = head;
        for(int i = 0; i < k; i++) {
            if(fast == null) {
                return null;
            }
            fast = fast.next;
        }
        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    /**
     * Removes the k-th element from the end of the linked list.
     * <p>
     * If k is 0, removes the last element. If k is equal to the length of the list,
     * removes the head element.
     * </p>
     *
     * @param k the position from the end (0-based) of the element to remove
     * @return the removed {@code Node}, or {@code null} if the list is empty or k is out of bounds
     */
    public Node removeKthElementFromEnd(int k) {
        Node pre = findKthNodeFromEnd(k + 1);
        if(pre == null) {
            head = head.next;
            return head;
        }
        Node del = pre.next;
        pre.next = del.next;
        return del;
    }

    
    /**
     * Converts the binary number represented by the linked list into its decimal equivalent.
     * Each node in the linked list contains a single binary digit (0 or 1), with the head node
     * representing the most significant bit.
     *
     * @return the decimal value of the binary number stored in the linked list
     */
    public int binaryToDecimal() {
        Node curr = head;
        int res = 0;
        while(curr != null) {
            res *= 2;
            res += curr.value;
            curr = curr.next;
        }
        return res;
    }

}

