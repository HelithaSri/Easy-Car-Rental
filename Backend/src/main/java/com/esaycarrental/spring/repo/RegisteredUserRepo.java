package com.esaycarrental.spring.repo;

import com.esaycarrental.spring.entity.RegisteredUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author Helitha Sri
 * @created 7/7/2022 - 6:40 PM
 * @project Easy Car Rental
 */

public interface RegisteredUserRepo extends JpaRepository<RegisteredUser, String> {

    @Query(value = "SELECT regUserId FROM registereduser ORDER BY regUserId DESC LIMIT 1", nativeQuery = true)
    String generateCustomerId();

}
