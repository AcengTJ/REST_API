package com.domain.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoginUserRequest {

    @NotBlank // tidak boleh kosong
    @Size(max = 100) // ukuran input untuk string
    private String username;

    @NotBlank
    @Size(max = 100)
    private String password;
}
