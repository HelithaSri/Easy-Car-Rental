package com.esaycarrental.spring.service;

import com.esaycarrental.spring.dto.RentDTO;

import java.util.List;

/**
 * @author Helitha Sri
 * @created 7/9/2022 - 11:22 AM
 * @project Easy Car Rental
 */

public interface RentService {

    void saveRent(RentDTO rentDTO);

    void deleteRent(String rentId);

    void updateRent(RentDTO rentDTO);

    List<RentDTO> getAllRents();

}
