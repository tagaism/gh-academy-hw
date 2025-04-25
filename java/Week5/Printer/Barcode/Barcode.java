package Week5.Printer.Barcode;

import Week5.Printer.IPrintable.IPrintable;

public class Barcode implements IPrintable{
    private String code;
    public Barcode(String code) {
        setCode(code);
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }

    @Override
    public void print() {
        System.out.printf("Barcode %s setn to lable printer.\n", getCode());
    }
}
