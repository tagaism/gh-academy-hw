package Week5.Printer;

import Week5.Printer.Barcode.Barcode;
import Week5.Printer.Document.Document;
import Week5.Printer.Photo.Photo;
import Week5.Printer.IPrintable.IPrintable;

public class Main {
    public static void main(String[] args){
        IPrintable[] printings = new IPrintable[] {
            new Document("java.docx"),
            new Photo("9x12"),
            new Barcode("A08923924")
        };

        for(IPrintable p : printings) {
            p.print();
        }
    }
}
