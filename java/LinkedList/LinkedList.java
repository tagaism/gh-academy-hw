package LinkedList;
/**
 * A singly linked list implementation supporting common operations such as insertion, deletion,
 * traversal, reversal, and advanced manipulations. Each node stores an integer value.
 * <p>
 * Features:
 * <ul>
 *   <li>Append, prepend, insert, and remove nodes by index or value</li>
 *   <li>Reverse the list in-place</li>
 *   <li>Find the middle node, detect cycles, and locate k-th node from the end</li>
 *   <li>Partition the list around a value, swap adjacent pairs, and convert binary to decimal</li>
 *   <li>Print the list and its metadata</li>
 * </ul>
 * <p>
 * All operations are performed in O(1) or O(n) time, depending on the method.
 * </p>
 */
/**
 * A singly linked list implementation supporting various operations such as insertion, deletion,
 * searching, reversing, partitioning, and more.
 * <p>
 * Each node in the list contains an integer value and a reference to the next node.
 * The list maintains references to its head and tail nodes, as well as its current length.
 * </p>
 *
 * <h2>Supported Operations:</h2>
 * <ul>
 *   <li>Append, prepend, insert, and remove nodes</li>
 *   <li>Get and set node values by index</li>
 *   <li>Reverse the list in-place</li>
 *   <li>Find the middle node</li>
 *   <li>Detect cycles (loops) in the list</li>
 *   <li>Find and remove the k-th node from the end</li>
 *   <li>Convert a binary number represented by the list to decimal</li>
 *   <li>Partition the list around a value</li>
 *   <li>Swap every two adjacent nodes</li>
 *   <li>Print the list and its metadata</li>
 * </ul>
 *
 * <h2>Usage Example:</h2>
 * <pre>
 *     LinkedList list = new LinkedList(1);
 *     list.append(2);
 *     list.append(3);
 *     list.printList(); // Output: 1->2->3->
 * </pre>
 *
 * <h2>Thread Safety:</h2>
 * <p>
 * This implementation is <b>not</b> thread-safe.
 * </p>
 *
 * @author tagai
 */
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

    /**
     * Returns the head node of the linked list.
     *
     * @return the head {@link Node} of the list, or {@code null} if the list is empty
     */
    public Node getHead() {
        return head;
    }

    /**
     * Returns the tail node of the linked list.
     *
     * @return the last node in the list, or {@code null} if the list is empty
     */
    public Node getTail() {
        return tail;
    }

    /**
     * Returns the current number of elements in the linked list.
     *
     * @return the length of the linked list
     */
    public int getLength() {
        return length;
    }

    /**
     * Prints the elements of the linked list in order, separated by arrows ("->").
     * Each node's value is displayed followed by an arrow, ending with a newline.
     * If the list is empty, only a newline is printed.
     */
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

    /**
     * Removes and returns the first node from the linked list.
     * If the list is empty, returns {@code null}.
     * Updates the head to the next node and decrements the length.
     * If the list becomes empty after removal, sets the tail to {@code null}.
     *
     * @return the removed first {@code Node}, or {@code null} if the list is empty
     */
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

    /**
     * Returns the node at the specified index in the linked list.
     *
     * @param index the position of the node to retrieve (0-based)
     * @return the {@code Node} at the specified index, or {@code null} if the index is out of bounds
     */
    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        for(int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    /**
     * Updates the value of the node at the specified index in the linked list.
     *
     * @param index the position of the node to update
     * @param value the new value to set for the node
     * @return true if the node was found and updated; false if the index is out of bounds
     */
    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    /**
     * Inserts a new node with the specified value at the given index in the linked list.
     *
     * @param index the position at which to insert the new node (0-based)
     * @param value the value to be stored in the new node
     * @return true if the insertion was successful; false if the index is out of bounds
     */
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

    /**
     * Finds the k-th node from the end of the linked list.
     *
     * This method uses two pointers to locate the k-th node from the end in a single pass.
     * If k is greater than the length of the list, it returns null.
     *
     * @param k the position from the end (1-based index)
     * @return the k-th {@link Node} from the end of the list, or null if k is out of bounds
     */
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

    /**
     * Rearranges the linked list so that all nodes with values less than {@code x} come before nodes with values
     * greater than or equal to {@code x}. The relative order of nodes in each partition is preserved.
     *
     * @param x the partition value; nodes with values less than {@code x} are moved before nodes with values
     *          greater than or equal to {@code x}
     */
    public void partitionList(int x) {
        Node dum1 = new Node(0);
        Node dum2 = new Node(0);
        Node c1 = dum1;
        Node c2 = dum2;
        Node curr = head;
        while(curr != null) {
            Node t = new Node(curr.value);
            if(t.value < x) {
                c1.next = t;
                c1 = c1.next;
            } else {
                c2.next = t;
                c2 = c2.next;
            }
            curr = curr.next;
        }
        c1.next = dum2.next;
        tail = c2;
        head = dum1.next;
    }

    /**
     * Swaps every two adjacent nodes in the linked list.
     * For example, given 1->2->3->4, after calling this method the list becomes 2->1->4->3.
     * The operation is performed in-place and updates the head of the list.
     */
    public void swapPairs() {
        Node d = new Node(0);
        d.next = head;
        Node f = head;
        Node p = d;
        while(f != null && f.next != null) {
            Node s = f.next;
            p.next = s;
            s.next = f;
            p = f;
            f = f.next;
        }
        head = d.next;
    }
}

