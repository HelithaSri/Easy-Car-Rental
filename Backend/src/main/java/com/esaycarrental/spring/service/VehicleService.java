package com.esaycarrental.spring.service;

import com.esaycarrental.spring.dto.VehicleDTO;

import java.util.List;

/**
 * @author Helitha Sri
 * @created 7/8/2022 - 12:05 PM
 * @project Easy Car Rental
 */

public interface VehicleService {

    void saveVehicle(VehicleDTO vehicleDTO);

    void deleteVehicle(String registrationNumber);

    void updateVehicle(VehicleDTO vehicleDTO);

    List<VehicleDTO> getAllVehicles();

    List<VehicleDTO> getAllVehiclesByStatus(String status);

    long countByStatus(String status);

    VehicleDTO vehicleDetails(String regNo);
}
