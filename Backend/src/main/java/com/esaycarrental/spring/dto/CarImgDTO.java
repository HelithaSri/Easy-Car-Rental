package com.esaycarrental.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Helitha Sri
 * @created 7/30/2022 - 8:53 PM
 * @project Easy Car Rental
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class CarImgDTO {
    private String imgId;
    private String path;
}
