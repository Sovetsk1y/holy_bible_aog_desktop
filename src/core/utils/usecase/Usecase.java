package core.utils.usecase;

import java.util.concurrent.Future;

import core.errors.Failure;
import core.utils.Either;

public interface Usecase<T, P> {
    Future<Either<Failure, T>> call(P params);
  }
