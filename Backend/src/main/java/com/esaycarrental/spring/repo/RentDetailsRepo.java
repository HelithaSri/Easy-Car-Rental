package com.esaycarrental.spring.repo;

import com.esaycarrental.spring.entity.RentDetails;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Helitha Sri
 * @created 7/9/2022 - 6:46 PM
 * @project Easy Car Rental
 */

public interface RentDetailsRepo extends JpaRepository<RentDetails,String> {
}
