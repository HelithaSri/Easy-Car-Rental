package com.esaycarrental.spring.service.Impl;

import com.esaycarrental.spring.dto.VehicleTypeDTO;
import com.esaycarrental.spring.entity.VehicleType;
import com.esaycarrental.spring.repo.VehicleRepo;
import com.esaycarrental.spring.repo.VehicleTypeRepo;
import com.esaycarrental.spring.service.VehicleTypeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Helitha Sri
 * @created 7/8/2022 - 10:31 PM
 * @project Easy Car Rental
 */

@Service
@Transactional
public class VehicleTypeServiceImpl implements VehicleTypeService {

    @Autowired
    private VehicleTypeRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveVehicleType(VehicleTypeDTO typeDTO) {
        if (!repo.existsById(typeDTO.getVehicleTypeId())){
            repo.save(mapper.map(typeDTO, VehicleType.class));
        }else {
            throw new RuntimeException("User Already Exist");
        }
    }

    @Override
    public void deleteVehicleType(String typeId) {

    }

    @Override
    public void updateVehicleType(VehicleTypeDTO typeDTO) {

    }

    @Override
    public List<VehicleTypeDTO> getAllVehicleType() {
        return null;
    }
}
