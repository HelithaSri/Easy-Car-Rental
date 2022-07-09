package com.esaycarrental.spring.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

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
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate rentDate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate returnDate;
}
