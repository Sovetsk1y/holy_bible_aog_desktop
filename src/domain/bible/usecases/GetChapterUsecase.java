package domain.bible.usecases;

import java.util.concurrent.Future;

import core.errors.Failure;
import core.utils.Either;
import core.utils.usecase.Usecase;
import domain.bible.entities.Chapter;
import domain.bible.repositories.BibleRepository;

public class GetChapterUsecase implements Usecase<Chapter, GetChapterUsecaseParams> {
    private BibleRepository bibleRepository;

    public GetChapterUsecase(BibleRepository bibleRepository) {
        this.bibleRepository = bibleRepository;
    }

    @Override
    public Future<Either<Failure, Chapter>> call(GetChapterUsecaseParams params) {
        return bibleRepository.getChapter(params.getAbbreviation(), params.getChapterNumber());
    }
    
}

class GetChapterUsecaseParams {
    private String abbreviation;
    private int chapterNumber;

    public String getAbbreviation() {
        return abbreviation;
    }

    public int getChapterNumber() {
        return chapterNumber;
    }

    public GetChapterUsecaseParams(String abbreviation, int chapterNumber) {
        this.abbreviation = abbreviation;
        this.chapterNumber = chapterNumber;
    }
}
