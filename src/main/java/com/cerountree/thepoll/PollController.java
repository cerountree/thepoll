package com.cerountree.thepoll;

import com.cerountree.thepoll.model.Option;
import com.cerountree.thepoll.model.Poll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PollController {

    @Autowired
    private PollService pollService;

    @GetMapping("/poll/{name}")
    public ResponseEntity<?> getPoll(@PathVariable String name) {
        Poll poll = pollService.getPoll(name);
        return ResponseEntity.ok(poll);
    }

    @GetMapping("/poll/getOptions")
    public ResponseEntity<?> getOptions(@RequestParam Poll poll){
        List<Option> options = pollService.getOptions(poll.getId());
        return ResponseEntity.ok(options);
    }

    @PostMapping("/poll/addPoll")
    public ResponseEntity<?> addPoll(@RequestParam("name") String name){
        String poll = pollService.addPoll(name);
        return ResponseEntity.ok(poll);
    }

    @PostMapping("/poll/addOption")
    public ResponseEntity<?> addOption(@RequestParam("name") String name,
                                       @RequestParam("poll") Poll poll){
        String option = pollService.addOption(name, poll.getId());
        return ResponseEntity.ok(option);
    }

    @PutMapping("/poll/updateOption")
    public ResponseEntity<?> updateOption(@RequestParam Option option){
        String result = pollService.updateOption(option);
        return ResponseEntity.ok(result);
    }
}
