package com.mongo.bug.broken;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface MyRepo extends MongoRepository<MyEntity, UUID> {
}
