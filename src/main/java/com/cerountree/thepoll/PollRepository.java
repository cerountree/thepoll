package com.cerountree.thepoll;

import com.cerountree.thepoll.model.Poll;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PollRepository extends MongoRepository<Poll, String>{

        Poll findByName(String name);

}
