/**
 * aniboys.id
 * Copyright (c) 2017-2023 All Rights Reserved.
 */
package com.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Aceng <acengtjhin69@aniboys.id>
 * @version $Id: ContactResponse.java, v 0.1 2023‐12‐05 15:55 Aceng Exp $$
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ContactResponse {
    private String id;

    private String firstName;

    private String lastName;

    private String email;

    private String phone;
}
