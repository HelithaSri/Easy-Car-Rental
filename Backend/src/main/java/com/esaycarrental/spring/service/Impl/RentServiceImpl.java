package com.esaycarrental.spring.service.Impl;

import com.esaycarrental.spring.dto.RentDTO;
import com.esaycarrental.spring.entity.Rent;
import com.esaycarrental.spring.repo.RentRepo;
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
    private RentRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveRent(RentDTO rentDTO) {
        if (!repo.existsById(rentDTO.getRentId())) {
            repo.save(mapper.map(rentDTO, Rent.class));
        } else {
            throw new RuntimeException("Rent Already Exist");
        }
    }

    @Override
    public void deleteRent(String rentId) {
        if (repo.existsById(rentId)) {
            repo.deleteById(rentId);
        } else {
            throw new RuntimeException("Please check the Rent ID... No Such Rent to Delete!");
        }
    }

    @Override
    public void updateRent(RentDTO rentDTO) {
        if (repo.existsById(rentDTO.getRentId())) {
            repo.save(mapper.map(rentDTO, Rent.class));
        } else {
            throw new RuntimeException("Please check the Rent ID... No Such Rent to Update!");
        }
    }

    @Override
    public List<RentDTO> getAllRents() {
        return mapper.map(repo.findAll(), new TypeToken<List<RentDTO>>() {
        }.getType());
    }
}
