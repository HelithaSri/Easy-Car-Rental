package com.esaycarrental.spring.repo;

import com.esaycarrental.spring.entity.Rent;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Helitha Sri
 * @created 7/9/2022 - 11:20 AM
 * @project Easy Car Rental
 */

public interface RentRepo extends JpaRepository<Rent, String> {
}
