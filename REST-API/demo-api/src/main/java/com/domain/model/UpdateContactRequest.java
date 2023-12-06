/**
 * aniboys.id
 * Copyright (c) 2017-2023 All Rights Reserved.
 */
package com.domain.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Aceng <acengtjhin69@aniboys.id>
 * @version $Id: ContactUserRequest.java, v 0.1 2023‐12‐05 15:04 Aceng Exp $$
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateContactRequest {
    @NotBlank
    private String id;

    @NotBlank
    @Size(max = 100)
    private String firstName;

    @Size(max = 100)
    private String lastName;

    @Size(max = 100)
    @Email
    private String email;

    @Size(max = 100)
    private String phone;
}
