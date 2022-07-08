package com.esaycarrental.spring.service.Impl;

import com.esaycarrental.spring.config.WebAppConfig;
import com.esaycarrental.spring.dto.RatesDTO;
import com.esaycarrental.spring.dto.VehicleDTO;
import com.esaycarrental.spring.dto.VehicleTypeDTO;
import com.esaycarrental.spring.service.VehicleService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Helitha Sri
 * @created 7/8/2022 - 1:42 PM
 * @project Easy Car Rental
 */

@WebAppConfiguration
@ContextConfiguration(classes = {WebAppConfig.class})
@ExtendWith(SpringExtension.class)
//@Transactional
class VehicleServiceImplTest {

    @Autowired
    VehicleService service;

    @Test
    void getAllVehicles() {
        RatesDTO ratesDTO = new RatesDTO(
                "Rate001",
                5000,
                50,
                1000,
                50,
                100
        );

        VehicleTypeDTO vehicleTypeDTO = new VehicleTypeDTO(
                "type001",
                "Genarel",
                15000
        );

        VehicleDTO vehicleDTO = new VehicleDTO(
                "V002",
                "Toyota",
                "Red",
                "Available",
                4,
                5000.00,
                "Petrol",
                "Auto",
                vehicleTypeDTO,
                ratesDTO

        );
        service.saveVehicle(vehicleDTO);
        System.out.println(service.getAllVehicles());
    }
}