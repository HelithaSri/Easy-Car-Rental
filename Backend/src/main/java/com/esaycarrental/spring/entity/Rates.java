package com.esaycarrental.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Helitha Sri
 * @created 7/7/2022 - 4:03 PM
 * @project Easy Car Rental
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class Rates {
    @Id
    private String rateId;
    private double monthlyRate;
    private double dailyRate;
    private double freeKmForaMonth;
    private double freeKmForaDay;
    private double pricePerExtraKm;
}
