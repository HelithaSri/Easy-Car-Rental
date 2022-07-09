package com.esaycarrental.spring.dto;

import com.esaycarrental.spring.entity.RegisteredUser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Helitha Sri
 * @created 7/7/2022 - 6:29 PM
 * @project Easy Car Rental
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class RentDTO {
    private String rentId;
    private LocalDate date;
    private String status;
    private String reason;
    private RegisteredUser userId;
    private List<RentDetailsDTO> rentDetails;
    private List<DriveScheduleDTO> driveSchedules;
}
