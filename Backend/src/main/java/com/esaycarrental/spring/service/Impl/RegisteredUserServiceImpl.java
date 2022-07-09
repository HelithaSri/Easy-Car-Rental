package com.esaycarrental.spring.service.Impl;

import com.esaycarrental.spring.dto.RegisteredUserDTO;
import com.esaycarrental.spring.entity.RegisteredUser;
import com.esaycarrental.spring.repo.RegisteredUserRepo;
import com.esaycarrental.spring.service.RegisteredUserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Helitha Sri
 * @created 7/7/2022 - 6:41 PM
 * @project Easy Car Rental
 */
@Service
@Transactional
public class RegisteredUserServiceImpl implements RegisteredUserService {

    @Autowired
    private RegisteredUserRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveUser(RegisteredUserDTO registeredUserDTO) {
        if (!repo.existsById(registeredUserDTO.getRegUserId())) {
            repo.save(mapper.map(registeredUserDTO, RegisteredUser.class));
        } else {
            throw new RuntimeException("User Already Exist");
        }
    }

    @Override
    public void deleteUser(String userId) {
        if (repo.existsById(userId)) {
            repo.deleteById(userId);
        } else {
            throw new RuntimeException("Please check the Registration User ID... No Such User to Delete!");
        }
    }

    @Override
    public void updateUser(RegisteredUserDTO userDTO) {
        if (repo.existsById(userDTO.getRegUserId())) {
            repo.save(mapper.map(userDTO, RegisteredUser.class));
        } else {
            throw new RuntimeException("Please check the Registration User ID... No Such User to Update!");
        }
    }

    @Override
    public List<RegisteredUserDTO> getAllUsers() {
        return mapper.map(repo.findAll(), new TypeToken<List<RegisteredUserDTO>>() {
        }.getType());
    }
}
