package Week5.Printer.Document;

import Week5.Printer.IPrintable.IPrintable;

public class Document implements IPrintable{
    private String fileName;
    public Document(String fileName) {
        setFileName(fileName);
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return this.fileName;
    }
    @Override
    public void print() {
        System.out.printf("Printing document: %s\n", getFileName());
    }
}
