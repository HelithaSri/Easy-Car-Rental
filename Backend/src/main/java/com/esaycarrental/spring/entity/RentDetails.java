package com.esaycarrental.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * @author Helitha Sri
 * @created 7/7/2022 - 3:26 PM
 * @project Easy Car Rental
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
@IdClass(RentDetails_PK.class)
public class RentDetails {
    @Id
    private String rentId;
    @Id
    private String registrationNumber;
    private String Status;
    private LocalDate rentDate;
    private LocalDate returnDate;
    private double km;
    private double damageCost;
    private double rentalTotal;

    @ManyToOne
    @JoinColumn(name = "rentId", referencedColumnName = "rentId", insertable = false, updatable = false)
    private Rent rent;

    @ManyToOne
    @JoinColumn(name = "registrationNumber", referencedColumnName = "registrationNumber", insertable = false, updatable = false)
    private Vehicle vehicle;
}
