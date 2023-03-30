package dev.sahil.movie;

import java.rmi.server.ObjID;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends MongoRepository<Review,ObjectId> {
    
}
