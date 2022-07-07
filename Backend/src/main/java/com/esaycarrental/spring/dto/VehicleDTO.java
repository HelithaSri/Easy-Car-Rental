package com.esaycarrental.spring.dto;

import com.esaycarrental.spring.entity.Rates;
import com.esaycarrental.spring.entity.VehicleType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Helitha Sri
 * @created 7/7/2022 - 6:21 PM
 * @project Easy Car Rental
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class VehicleDTO {
    private String registrationNumber;
    private String brand;
    private String color;
    private String status;
    private String noOfPassengers;
    private String runningKm;
    private String fuelType;
    private String transmissionType;
    private VehicleType type;
    private Rates rates;
}