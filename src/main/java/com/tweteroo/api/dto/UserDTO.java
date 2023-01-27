package com.tweteroo.api.dto;

import org.hibernate.validator.constraints.URL;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

public record UserDTO(

        @NotBlank String username,

        @URL @NotEmpty String avatar

) {
}
