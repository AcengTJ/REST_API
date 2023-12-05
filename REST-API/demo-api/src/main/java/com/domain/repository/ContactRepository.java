/**
 * aniboys.id
 * Copyright (c) 2017-2023 All Rights Reserved.
 */
package com.domain.repository;

import com.domain.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Aceng <acengtjhin69@aniboys.id>
 * @version $Id: ContactRepository.java, v 0.1 2023‐12‐05 15:58 Aceng Exp $$
 */
@Repository
public interface ContactRepository extends JpaRepository<Contact, String> {

}
