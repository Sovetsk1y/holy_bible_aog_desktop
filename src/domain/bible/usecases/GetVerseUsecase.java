package domain.bible.usecases;

import java.util.concurrent.Future;

import core.errors.Failure;
import core.utils.Either;
import core.utils.usecase.Usecase;
import domain.bible.entities.Verse;
import domain.bible.repositories.BibleRepository;

public class GetVerseUsecase implements Usecase<Verse, GetVerseUsecaseParams> {
    private BibleRepository bibleRepository;

    public GetVerseUsecase(BibleRepository bibleRepository) {
        this.bibleRepository = bibleRepository;
    }

    @Override
    public Future<Either<Failure, Verse>> call(GetVerseUsecaseParams params) {
        return bibleRepository.getVerse(params.getAbbreviation(), params.getChapterNumber(), params.getVerseNumber());
    }
    
}

class GetVerseUsecaseParams {
    private String abbreviation;
    private int chapterNumber;
    private int verseNumber;

    public String getAbbreviation() {
        return abbreviation;
    }

    public int getChapterNumber() {
        return chapterNumber;
    }

    public int getVerseNumber() {
        return verseNumber;
    }

    public GetVerseUsecaseParams(String abbreviation, int chapterNumber, int verseNumber) {
        this.abbreviation = abbreviation;
        this.chapterNumber = chapterNumber;
        this.verseNumber = verseNumber;
    }
}
