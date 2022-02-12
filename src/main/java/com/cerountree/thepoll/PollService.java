package com.cerountree.thepoll;

import com.cerountree.thepoll.model.Option;
import com.cerountree.thepoll.model.Poll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PollService {

    @Autowired
    PollRepository pollRepo;
    OptionRepository optionRepo;

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
        optionRepo.insert(option);
        return option.getName();
    }

    public List<Option> getOptions(String pollId) {
        return optionRepo.findByPollId(pollId);
    }

    public String updateOption(Option option) {
       option = optionRepo.save(option);
         return option.getId();
    }
}
