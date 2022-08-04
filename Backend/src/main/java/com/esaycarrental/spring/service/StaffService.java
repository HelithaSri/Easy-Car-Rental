package com.esaycarrental.spring.service;

import com.esaycarrental.spring.dto.StaffDTO;
import com.esaycarrental.spring.entity.Staff;

import java.util.List;

/**
 * @author Helitha Sri
 * @created 7/9/2022 - 9:35 AM
 * @project Easy Car Rental
 */

public interface StaffService {

    void saveStaff(StaffDTO staffDTO);

    void deleteStaff(String staffId);

    void updateStaff(StaffDTO staffDTO);

    List<StaffDTO> getAllStaffs();

    String generateStaffId();
}
