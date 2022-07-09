package com.esaycarrental.spring.repo;

import com.esaycarrental.spring.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Helitha Sri
 * @created 7/9/2022 - 3:01 PM
 * @project Easy Car Rental
 */

public interface DriverRepo extends JpaRepository<Driver, String> {

}
