/**
 * aniboys.id
 * Copyright (c) 2017-2023 All Rights Reserved.
 */
package com.domain.repository;

import com.domain.entity.Contact;
import com.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Aceng <acengtjhin69@aniboys.id>
 * @version $Id: ContactRepository.java, v 0.1 2023‐12‐05 15:58 Aceng Exp $$
 */
@Repository
public interface ContactRepository extends JpaRepository<Contact, String> {
    Optional<Contact> findFirstByUserAndId(User user, String id);
}
