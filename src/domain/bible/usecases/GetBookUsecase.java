package domain.bible.usecases;

import domain.bible.entities.Book;
import domain.bible.repositories.*;

import java.util.concurrent.Future;

import core.errors.Failure;
import core.utils.Either;
import core.utils.usecase.Usecase;

public class GetBookUsecase implements Usecase<Book, GetBookUsecaseParams> {

    private BibleRepository bibleRepository;

    public GetBookUsecase(BibleRepository bibleRepository) {
        this.bibleRepository = bibleRepository;
    }

    @Override
    public Future<Either<Failure, Book>> call(GetBookUsecaseParams params) {
        return bibleRepository.getBook(params.getAbbreviation());
    }

}

class GetBookUsecaseParams {
    private String abbreviation;

    public String getAbbreviation() {
        return abbreviation;
    }

    public GetBookUsecaseParams(String abbreviation) {
        this.abbreviation = abbreviation;
    }
}
