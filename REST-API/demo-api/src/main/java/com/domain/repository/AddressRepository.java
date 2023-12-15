/**
 * aniboys.id
 * Copyright (c) 2017-2023 All Rights Reserved.
 */
package com.domain.repository;

import com.domain.entity.Address;
import com.domain.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author Aceng <acengtjhin69@aniboys.id>
 * @version $Id: AddressRepository.java, v 0.1 2023‐12‐14 15:42 Aceng Exp $$
 */
@Repository
public interface AddressRepository extends JpaRepository<Address, String> {
    Optional<Address> findFirstByContactAndId(Contact contact, String id);

    List<Address> findAllByContact(Contact contact);
}