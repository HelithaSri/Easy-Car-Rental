package com.esaycarrental.spring.service.Impl;

import com.esaycarrental.spring.dto.RatesDTO;
import com.esaycarrental.spring.dto.VehicleDTO;
import com.esaycarrental.spring.dto.VehicleTypeDTO;
import com.esaycarrental.spring.entity.Vehicle;
import com.esaycarrental.spring.repo.RatesRepo;
import com.esaycarrental.spring.repo.VehicleRepo;
import com.esaycarrental.spring.repo.VehicleTypeRepo;
import com.esaycarrental.spring.service.VehicleService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Helitha Sri
 * @created 7/8/2022 - 12:10 PM
 * @project Easy Car Rental
 */

@Service
@Transactional
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private RatesRepo ratesRepo;

    @Autowired
    private VehicleTypeRepo vehicleTypeRepo;

    @Override
    public void saveVehicle(VehicleDTO vehicleDTO) {
        if (!repo.existsById(vehicleDTO.getRegistrationNumber())) {

            if (vehicleTypeRepo.existsById(vehicleDTO.getType().getVehicleTypeId())) {
                VehicleTypeDTO type = mapper.map(vehicleTypeRepo.findByVehicleTypeId(vehicleDTO.getType().getVehicleTypeId()), VehicleTypeDTO.class);
                vehicleDTO.setType(type);
            } else {
                throw new RuntimeException("Please Check the Vehicle Type ID");
            }

            if (ratesRepo.existsById(vehicleDTO.getRates().getRateId())) {
                RatesDTO rates = mapper.map(ratesRepo.findByRateId(vehicleDTO.getRates().getRateId()), RatesDTO.class);
                vehicleDTO.setRates(rates);
            } else {
                throw new RuntimeException("Please Check the RateID");
            }

//            System.out.println("\nchange : "+ vehicleDTO+"\n");
            repo.save(mapper.map(vehicleDTO, Vehicle.class));
        } else {
            throw new RuntimeException("Vehicle Already Exist");
        }
    }

    @Override
    public void deleteVehicle(String registrationNumber) {
        if (repo.existsById(registrationNumber)) {
            repo.deleteById(registrationNumber);
        } else {
            throw new RuntimeException("Please check the Registration Number... No Such Vehicle to Delete!");
        }
    }

    @Override
    public void updateVehicle(VehicleDTO vehicleDTO) {
        if (repo.existsById(vehicleDTO.getRegistrationNumber())) {

            if (vehicleTypeRepo.existsById(vehicleDTO.getType().getVehicleTypeId())) {
                VehicleTypeDTO type = mapper.map(vehicleTypeRepo.findByVehicleTypeId(vehicleDTO.getType().getVehicleTypeId()), VehicleTypeDTO.class);
                vehicleDTO.setType(type);
            } else {
                throw new RuntimeException("Please Check the Vehicle Type ID");
            }

            if (ratesRepo.existsById(vehicleDTO.getRates().getRateId())) {
                RatesDTO rates = mapper.map(ratesRepo.findByRateId(vehicleDTO.getRates().getRateId()), RatesDTO.class);
                vehicleDTO.setRates(rates);
            } else {
                throw new RuntimeException("Please Check the RateID");
            }

            repo.save(mapper.map(vehicleDTO, Vehicle.class));
        } else {
            throw new RuntimeException("Please check the Registration Number... No Such Vehicle to Update!");
        }
    }

    @Override
    public List<VehicleDTO> getAllVehicles() {
        return mapper.map(repo.findAll(), new TypeToken<List<VehicleDTO>>() {
        }.getType());
    }

    @Override
    public List<VehicleDTO> getAllVehiclesByStatus(String status) {
        return mapper.map(repo.searchVehiclesByStatus(status), new TypeToken<List<VehicleDTO>>() {
        }.getType());
    }

    @Override
    public long countByStatus(String status) {
        return repo.countVehiclesByStatus(status);
    }
}
