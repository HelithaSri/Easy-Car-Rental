package com.esaycarrental.spring.repo;

import com.esaycarrental.spring.entity.Rates;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Helitha Sri
 * @created 7/8/2022 - 2:07 PM
 * @project Easy Car Rental
 */

public interface RatesRepo extends JpaRepository<Rates, String> {

    Rates findByRateId(String rateId);
}
