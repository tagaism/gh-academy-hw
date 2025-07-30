package HashTable;

public class Main {
    public static void main(String[] args) {
        HashTable table = new HashTable();
        table.set("deloitte", 123);
        table.set("google", 453);
        table.set("amazon", 2511);
        table.set("paypay", 4214);
        table.set("microsoft", 4214);
        table.set("apple", 4214);
        table.set("facebook", 4214);
        table.set("nvidia", 4214);
        table.set("spacex", 4214);
        table.printTable();
    }
}
