package com.tweteroo.api.dto;

import org.hibernate.validator.constraints.URL;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record TweetDTO(

        @NotBlank @Size(max = 42) String username,

        @NotNull @URL @Size(max = 200) String avatar,

        @NotBlank @Size(max = 144) String text

) {
}
