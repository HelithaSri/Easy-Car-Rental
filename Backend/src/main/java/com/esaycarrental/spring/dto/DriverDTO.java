package com.esaycarrental.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Helitha Sri
 * @created 7/9/2022 - 2:39 PM
 * @project Easy Car Rental
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class DriverDTO {
    String driverId;
    String name;
    String address;
    String mobileNo;
    String email;
    String password;
    String status;
}
