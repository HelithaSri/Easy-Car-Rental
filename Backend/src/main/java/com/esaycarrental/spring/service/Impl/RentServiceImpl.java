package com.esaycarrental.spring.service.Impl;

import com.esaycarrental.spring.dto.RentDTO;
import com.esaycarrental.spring.entity.Rent;
import com.esaycarrental.spring.entity.RentDetails;
import com.esaycarrental.spring.entity.Vehicle;
import com.esaycarrental.spring.repo.RentRepo;
import com.esaycarrental.spring.repo.VehicleRepo;
import com.esaycarrental.spring.service.RentService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Helitha Sri
 * @created 7/9/2022 - 11:23 AM
 * @project Easy Car Rental
 */

@Service
@Transactional
public class RentServiceImpl implements RentService {

    @Autowired
    private RentRepo rentRepo;

    @Autowired
    private VehicleRepo vehicleRepo;

    @Autowired
    private RentRepo rentRepo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveRent(RentDTO rentDTO) {
            Rent rent = mapper.map(rentDTO, Rent.class);
        if (!rentRepo.existsById(rentDTO.getRentId())) {
            rentRepo.save(mapper.map(rentDTO, Rent.class));

            if (rentDTO.getRentDetails().size()<1){
                throw new RuntimeException("No Vehicle added for the Rent..!");
            }

            for (RentDetails details:rent.getRentDetails()){
                Vehicle vehicle = vehicleRepo.findById(details.getRentId()).get();
                vehicle.setStatus("Rented out");
                vehicleRepo.save(vehicle);
            }

            if (rentDTO.getDriveSchedules().size()>=1){
                for ()
            }

        } else {
            throw new RuntimeException("Rent Already Exist");
        }
    }

    @Override
    public void deleteRent(String rentId) {
        if (rentRepo.existsById(rentId)) {
            rentRepo.deleteById(rentId);
        } else {
            throw new RuntimeException("Please check the Rent ID... No Such Rent to Delete!");
        }
    }

    @Override
    public void updateRent(RentDTO rentDTO) {
        if (rentRepo.existsById(rentDTO.getRentId())) {
            rentRepo.save(mapper.map(rentDTO, Rent.class));
        } else {
            throw new RuntimeException("Please check the Rent ID... No Such Rent to Update!");
        }
    }

    @Override
    public List<RentDTO> getAllRents() {
        return mapper.map(rentRepo.findAll(), new TypeToken<List<RentDTO>>() {
        }.getType());
    }
}
