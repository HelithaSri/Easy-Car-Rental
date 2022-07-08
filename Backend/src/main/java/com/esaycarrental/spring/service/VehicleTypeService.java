package com.esaycarrental.spring.service;

import com.esaycarrental.spring.dto.VehicleTypeDTO;

import java.util.List;

/**
 * @author Helitha Sri
 * @created 7/8/2022 - 10:30 PM
 * @project Easy Car Rental
 */

public interface VehicleTypeService {
    void saveVehicleType(VehicleTypeDTO typeDTO);

    void deleteVehicleType(String typeId);

    void updateVehicleType(VehicleTypeDTO typeDTO);

    List<VehicleTypeDTO> getAllVehicleType();
}
