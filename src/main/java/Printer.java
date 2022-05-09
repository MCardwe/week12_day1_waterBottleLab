public class Printer {
    private int numOfSheets;
    private int tonerVolume;

    public Printer(int numOfSheets) {
        this.numOfSheets = numOfSheets;
        this.tonerVolume = 100;
    }

    public int getNumOfSheets() {
        return numOfSheets;
    }

    public String print(int pages, int copies) {
        int copiesNeeded = pages * copies;
        if (numOfSheets - copiesNeeded >= 0) {
            this.numOfSheets -= copiesNeeded;
            this.tonerVolume -= copiesNeeded;
            return String.format("%s copies printed. %s sheets of paper left", copiesNeeded, this.numOfSheets);
        } else {
            return "Failed to print, not enough paper.";
        }
    }

    public int getTonerVolume() {
        return this.tonerVolume;
    }
}
