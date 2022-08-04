package com.esaycarrental.spring.service;

import com.esaycarrental.spring.dto.RatesDTO;

import java.util.List;

/**
 * @author Helitha Sri
 * @created 7/8/2022 - 2:08 PM
 * @project Easy Car Rental
 */

public interface RatesService {
    void saveRates(RatesDTO ratesDTO);

    void deleteRates(String rateID);

    void updateRates(RatesDTO ratesDTO);

    List<RatesDTO> getAllRates();

    String generateRatesId();
}
