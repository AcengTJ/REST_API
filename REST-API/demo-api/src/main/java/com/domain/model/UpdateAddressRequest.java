/**
 * aniboys.id
 * Copyright (c) 2017-2023 All Rights Reserved.
 */
package com.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Aceng <acengtjhin69@aniboys.id>
 * @version $Id: CreateAddressRequest.java, v 0.1 2023‐12‐14 15:36 Aceng Exp $$
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateAddressRequest {

    @JsonIgnore
    @NotBlank
    private String contactId;

    @JsonIgnore
    @NotBlank
    private String addressId;

    @Size(max = 200)
    private String street;

    @Size(max = 100)
    private String city;

    @Size(max = 100)
    private String province;

    @NotBlank
    @Size(max = 100)
    private String country;

    @Size(max = 10)
    private String postalCode;
}
