/**
 * aniboys.id
 * Copyright (c) 2017-2023 All Rights Reserved.
 */
package com.domain.model;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Aceng <acengtjhin69@aniboys.id>
 * @version $Id: UpdateUserRequest.java, v 0.1 2023‐12‐04 14:59 Aceng Exp $$
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateUserRequest {
    @Size(max = 100)
    private String name;

    @Size(max = 100)
    private String password;
}
