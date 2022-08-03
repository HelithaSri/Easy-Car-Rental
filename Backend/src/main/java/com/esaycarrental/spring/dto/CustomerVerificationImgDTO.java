package com.esaycarrental.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Helitha Sri
 * @created 8/3/2022 - 7:38 PM
 * @project Easy Car Rental
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class CustomerVerificationImgDTO {
    private String imgId;
    private String path;
}
