package com.cerountree.thepoll;

import com.cerountree.thepoll.model.Option;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface OptionRepository extends MongoRepository<Option, String> {

    List<Option> findByPollId(String pollId);


}
