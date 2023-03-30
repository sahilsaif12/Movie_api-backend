package dev.sahil.movie;

import java.rmi.server.ObjID;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection ="reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    @Id
    private ObjectId id;
    private String body;
    private String sourceImdbId;
    public Review(String body ,String source) {
        this.body = body;
        this.sourceImdbId = source;
    }
}
