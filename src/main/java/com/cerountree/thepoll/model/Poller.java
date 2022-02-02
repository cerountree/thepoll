package com.cerountree.thepoll.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Poller {

    @org.springframework.data.annotation.Id
    private String Id;

    public Poller() {

    }

}
