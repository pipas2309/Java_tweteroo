package com.tweteroo.api.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TweetModel {
    private String username;
    private String tweet;
}
