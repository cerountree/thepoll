package com.cerountree.thepoll.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Option {
    @Id
    private String Id;
    private String name;
    private String pollId;
    private int count;

    public Option(String name, String pollId) {
        this.pollId = pollId;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPollId() {
        return pollId;
    }

    public void setPollId(String pollId) {
        this.pollId = pollId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private void addCount(int count){
        this.count += count;
    }

    public String getId() {
        return Id;
    }
}
