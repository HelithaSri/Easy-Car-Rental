package com.esaycarrental.spring.service;

import com.esaycarrental.spring.dto.RegisteredUserDTO;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author Helitha Sri
 * @created 7/7/2022 - 6:41 PM
 * @project Easy Car Rental
 */

public interface RegisteredUserService {
    void saveUser(RegisteredUserDTO registeredUserDTO);

    void deleteUser(String userId);

    void updateUser(RegisteredUserDTO userDTO);

    List<RegisteredUserDTO> getAllUsers();

    long countUsers();

    void saveCustomerWithImg(String customer, MultipartFile file);

}
