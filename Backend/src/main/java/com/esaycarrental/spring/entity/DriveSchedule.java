package com.esaycarrental.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * @author Helitha Sri
 * @created 7/7/2022 - 4:36 PM
 * @project Easy Car Rental
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
@IdClass(DriveSchedule_PK.class)
public class DriveSchedule {
    @Id
    private String registrationNumber;
    @Id
    private String rentId;
    @Id
    private String driverId;
    private LocalDate rentDate;
    private LocalDate returnDate;

    @ManyToOne
    @JoinColumn(name = "rentId", referencedColumnName = "rentId", insertable = false, updatable = false)
    private Rent rent;

    @ManyToOne
    @JoinColumn(name = "registrationNumber", referencedColumnName = "registrationNumber", insertable = false, updatable = false)
    private Vehicle vehicle;

    @ManyToOne
    @JoinColumn(name = "driverId", referencedColumnName = "driverId", insertable = false, updatable = false)
    private Driver driver;
}
