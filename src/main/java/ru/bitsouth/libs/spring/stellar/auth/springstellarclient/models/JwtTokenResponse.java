package ru.bitsouth.libs.spring.stellar.auth.springstellarclient.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JwtTokenResponse {
    @NotBlank
    String token;
}
