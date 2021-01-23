package domain.bible.entities;

public class Verse {
    private int number;
    private String text;

    public int getNumber() {
        return number;
    }
    public String getText() {
        return text;
    }

    public Verse(int number, String text) {
        this.number = number;
        this.text = text;
    }
}

