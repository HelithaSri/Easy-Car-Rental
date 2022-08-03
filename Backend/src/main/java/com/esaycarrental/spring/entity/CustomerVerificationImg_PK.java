package com.esaycarrental.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Helitha Sri
 * @created 8/3/2022 - 7:34 PM
 * @project Easy Car Rental
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerVerificationImg_PK implements Serializable {
    private String verificationimgId;
    private String customerID;
}
