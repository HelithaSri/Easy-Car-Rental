package com.esaycarrental.spring.service;

import com.esaycarrental.spring.dto.DriverDTO;
import com.esaycarrental.spring.dto.StaffDTO;
import com.esaycarrental.spring.entity.Staff;

import java.util.List;

/**
 * @author Helitha Sri
 * @created 7/9/2022 - 3:02 PM
 * @project Easy Car Rental
 */

public interface DriverService {

    void saveDriver(DriverDTO driverDTO);

    void deleteDriver(String driverId);

    void updateDriver(DriverDTO driverDTO);

    List<DriverDTO> getAllDrivers();

    String generateDriverId();
}
