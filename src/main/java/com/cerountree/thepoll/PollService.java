package com.cerountree.thepoll;

import com.cerountree.thepoll.model.Option;
import com.cerountree.thepoll.model.Poll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;

@Service
public class PollService {

    @Autowired
    PollRepository pollRepo;

    public Poll getPoll(String name){
        return pollRepo.findByName(name);
    }

    public String addPoll(String name){
        Poll poll = new Poll(name);
        pollRepo.insert(poll);
        return poll.getName();
    }

    public String addOption(String name, String pollId){
        Option option = new Option(name, pollId);
        pollRepo.insert(option);
        return option.getName();
    }

    public List<Option> getOptions(String pollId) {
        HashSet<Option> options = new HashSet<>();

    }
}
