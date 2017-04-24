package com.microservice.repository;

import com.microservice.model.Event;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by jack on 20/04/2017.
 */
public interface EventRepository extends MongoRepository<Event, String>{
    List <Event> findByName(@Param("name") String name);
    List <Event> findByNumberLimit(@Param("numberLimit") Integer numberLimit);
}
