package Week5.Printer.Photo;

import Week5.Printer.IPrintable.IPrintable;

public class Photo implements IPrintable{
    private String format;
    public Photo(String format) {
        setFormat(format);
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getFormat() {
        return this.format;
    }

    @Override
    public void print() {
        System.out.println("Photo printed in color.");
    }
}
