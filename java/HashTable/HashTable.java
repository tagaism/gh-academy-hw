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
