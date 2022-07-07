package com.esaycarrental.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

/**
 * @author Helitha Sri
 * @created 7/7/2022 - 3:27 PM
 * @project Easy Car Rental
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class Vehicle {
    @Id
    private String registrationNumber;
    private String brand;
    private String color;
    private String status;
    private String noOfPassengers;
    private String runningKm;
    private String fuelType;
    private String transmissionType;

    @ManyToOne(cascade = {CascadeType.REFRESH, CascadeType.DETACH})
    @JoinColumn(name = "type", referencedColumnName = "vehicleTypeId", nullable = false)
    private VehicleType type;

    @ManyToOne(cascade = {CascadeType.REFRESH, CascadeType.DETACH})
    @JoinColumn(name = "rates", referencedColumnName = "rateId", nullable = false)
    private Rates rates;
}
