package com.esaycarrental.spring.dto;

import com.esaycarrental.spring.entity.Vehicle;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Helitha Sri
 * @created 7/30/2022 - 11:26 PM
 * @project Easy Car Rental
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class VehicleWithImgDTO {
    private String vehicle;
    private MultipartFile file;
}
