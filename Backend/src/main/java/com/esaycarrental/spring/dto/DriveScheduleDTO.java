package com.esaycarrental.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Id;
import java.time.LocalDate;

/**
 * @author Helitha Sri
 * @created 7/7/2022 - 6:32 PM
 * @project Easy Car Rental
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class DriveScheduleDTO {
    private String registrationNumber;
    private String rentId;
    private String staffId;
    private LocalDate rentDate;
    private LocalDate returnDate;
}
