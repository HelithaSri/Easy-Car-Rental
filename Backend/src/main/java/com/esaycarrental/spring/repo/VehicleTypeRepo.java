package com.esaycarrental.spring.repo;

import com.esaycarrental.spring.entity.VehicleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author Helitha Sri
 * @created 7/8/2022 - 2:06 PM
 * @project Easy Car Rental
 */

public interface VehicleTypeRepo extends JpaRepository<VehicleType, String> {

    VehicleType findByVehicleTypeId(String vehicleId);

    @Query(value = "SELECT vehicleTypeId FROM vehicletype ORDER BY vehicleTypeId DESC LIMIT 1", nativeQuery = true)
    String generateVehicleTypeId();
}
