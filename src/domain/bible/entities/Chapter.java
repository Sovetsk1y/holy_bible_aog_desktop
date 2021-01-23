package domain.bible.entities;

public class Chapter {
    private int number;
    private Verse[] verses;

    public Verse[] getVerses() {
        return verses;
    }

    public int getNumber() {
        return number;
    }

    public Chapter(Verse[] verses) {
        this.verses = verses;
    }
}