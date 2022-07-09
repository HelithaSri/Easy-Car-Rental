package com.esaycarrental.spring.service.Impl;

import com.esaycarrental.spring.dto.StaffDTO;
import com.esaycarrental.spring.entity.Staff;
import com.esaycarrental.spring.repo.StaffRepo;
import com.esaycarrental.spring.service.StaffService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Helitha Sri
 * @created 7/9/2022 - 9:35 AM
 * @project Easy Car Rental
 */

@Service
@Transactional
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveStaff(StaffDTO staffDTO) {
        if (!repo.existsById(staffDTO.getStaffId())){
            repo.save(mapper.map(staffDTO,Staff.class));
        }else {
            throw new RuntimeException("User Already Exist");
        }
    }

    @Override
    public void deleteStaff(String staffId) {
        if (repo.existsById(staffId)){
            repo.deleteById(staffId);
        }else {
            throw new RuntimeException("Please check the Staff ID... No Such Staff to Delete!");
        }
    }

    @Override
    public void updateStaff(StaffDTO staffDTO) {
        if (repo.existsById(staffDTO.getStaffId())){
            repo.save(mapper.map(staffDTO,Staff.class));
        }else {
            throw new RuntimeException("Please check the Staff ID... No Such Staff to Update!");
        }
    }

    @Override
    public List<Staff> getAllStaffs() {
        return mapper.map(repo.findAll(), new TypeToken<List<StaffDTO>>(){}.getType());
    }
}
