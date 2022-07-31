package com.esaycarrental.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Helitha Sri
 * @created 7/30/2022 - 8:37 PM
 * @project Easy Car Rental
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CarImg_PK implements Serializable {
    private String imgId;
    private String carId;
}
