package domain.bible.entities;

public class Book {
    private String name;
    private String abbreviation;
    private Chapter[] chapters;

    public String getName() {
        return name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public Chapter[] getChapters() {
        return chapters;
    }

    public Book(Chapter[] chapters) {
        this.chapters = chapters;
    }
}
