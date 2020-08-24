public class Printer {
    private int sheets;
    private int toner;

    public Printer(int sheets, int toner) {
        this.sheets = sheets;
        this.toner = toner;
    }

    public int getSheets() {
        return sheets;
    }

    public int getToner() {
        return toner;
    }

    public void print(int pages, int copies) {
        int totalPages = pages * copies;
        if (this.sheets >= totalPages) {
            this.sheets -= totalPages;
            this.toner -= totalPages;
        }
    }
}
