public class Printer {
    private int sheets;

    public Printer(int sheets) {
        this.sheets = sheets;
    }

    public int getSheets() {
        return sheets;
    }

    public void print(int pages, int copies) {
        int totalPages = pages * copies;
        if (this.sheets >= totalPages) {
            this.sheets -= totalPages;
        }
    }
}
