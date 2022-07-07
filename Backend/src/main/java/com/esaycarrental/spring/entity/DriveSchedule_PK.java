package com.esaycarrental.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author Helitha Sri
 * @created 7/7/2022 - 4:42 PM
 * @project Easy Car Rental
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class DriveSchedule_PK implements Serializable {
    private String registrationNumber;
    private String rentId;
    private String staffId;
}
