package com.tweteroo.api.model;

import com.tweteroo.api.dto.TweetDTO;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class TweetModel {

    public TweetModel(TweetDTO tweet) {
        this.username = tweet.username();
        this.tweet = tweet.text();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 42, nullable = false)
    private String username;
    
    @Column(length = 144, nullable = false)
    private String tweet;
}
