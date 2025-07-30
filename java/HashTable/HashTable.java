package HashTable;

public class HashTable {
    int size = 7;
    Node[] dataMap;
    class Node {
        int value;
        String key;
        Node next;
        Node(String k, int val) {
            key = k;
            value = val;
        }
    }
    HashTable() {
        dataMap = new Node[size];
    }

    private int hash(String key) {
        int res = 0;
        for(char c : key.toCharArray()) {
            int intAscii = c;
            res = (res + intAscii * 23) % size;
        }
        return res;
    }

    /**
     * Inserts a key-value pair into the hash table.
     * If the key's hash index is empty, creates a new node at that index.
     * If there is a collision (i.e., the index is already occupied), appends the new node
     * to the end of the linked list at that index.
     *
     * @param k   the key to insert
     * @param val the value associated with the key
     */
    public void set(String k, int val) {
        int idx = hash(k);
        Node nn = new Node(k, val);
        if(dataMap[idx] == null) {
            dataMap[idx] = nn;
        } else {
            Node temp = dataMap[idx];
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = nn;
        }
    }

    /**
     * Prints the contents of the hash table to the standard output.
     * For each index in the hash table, prints the index followed by all key-value pairs
     * stored in the linked list at that index.
     * Each key-value pair is printed in the format: {key: value}.
     */
    public void printTable() {
        for(int i = 0; i < size; i++) {
            System.out.println(i + ": ");
            Node temp = dataMap[i];
            while(temp != null) {
                System.out.println("    {" + temp.key + ": " + temp.value + "}");
                temp = temp.next;
            }
        }
    }
}
