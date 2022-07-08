package com.esaycarrental.spring.controller;

import com.esaycarrental.spring.dto.VehicleDTO;
import com.esaycarrental.spring.service.VehicleService;
import com.esaycarrental.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author Helitha Sri
 * @created 7/8/2022 - 12:27 PM
 * @project Easy Car Rental
 */

@RestController
@RequestMapping("api/vehicle")
@CrossOrigin
public class VehicleController {

    @Autowired
    VehicleService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllVehicles(){
        return new ResponseUtil(200,"Ok",service.getAllVehicles());
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveVehicle(@RequestBody VehicleDTO dto){
        System.out.println("obj : "+dto);
        System.out.println("obj c  : "+dto.getType().getVehicleTypeId());
        service.saveVehicle(dto);
        return new ResponseUtil(200,"New Vehicle Added Successfully",null);
    }

    @DeleteMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteVehicle(@RequestParam String regNo){
        service.deleteVehicle(regNo);
        return new ResponseUtil(200,"Vehicle Delete Successfully",null);
    }

    public ResponseUtil updateVehicle(@RequestBody VehicleDTO dto){
        service.updateVehicle(dto);
        return new ResponseUtil(200,"User Update Successfully",null);
    }

}