package com.esaycarrental.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Helitha Sri
 * @created 7/7/2022 - 6:28 PM
 * @project Easy Car Rental
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class RegisteredUserDTO {
    private String regUserId;
    private String name;
    private String address;
    private String nicNo;
    private String drivingLicenseNo;
    private String mobileNo;
    private String password;
    private String email;
}
