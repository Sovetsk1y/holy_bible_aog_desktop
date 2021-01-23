package domain.bible.repositories;

import java.util.concurrent.Future;

import core.errors.Failure;
import core.utils.*;

import domain.bible.entities.*;

public interface BibleRepository {
    public Future<Either<Failure, Book>> getBook(String abbreviation);
    public Future<Either<Failure, Chapter>> getChapter(String abbreviation ,int number);
    public Future<Either<Failure, Verse>> getVerse(String abbreviation, int chapter, int verse);
}
