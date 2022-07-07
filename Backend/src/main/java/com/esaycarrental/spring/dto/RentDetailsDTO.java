package com.esaycarrental.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Id;
import java.time.LocalDate;

/**
 * @author Helitha Sri
 * @created 7/7/2022 - 6:31 PM
 * @project Easy Car Rental
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class RentDetailsDTO {
    private String rentId;
    private String registrationNumber;
    private String Status;
    private LocalDate rentDate;
    private LocalDate returnDate;
    private double km;
    private double damageCost;
    private double rentalTotal;
}
