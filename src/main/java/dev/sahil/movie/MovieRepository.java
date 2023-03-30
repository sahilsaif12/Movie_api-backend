package dev.sahil.movie;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepository extends MongoRepository<movie,ObjectId>{
    public Optional<movie> findMovieByImdbId(String imdbId);
}
