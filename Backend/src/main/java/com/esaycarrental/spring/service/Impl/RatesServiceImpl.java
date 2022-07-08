package com.esaycarrental.spring.service.Impl;

import com.esaycarrental.spring.dto.RatesDTO;
import com.esaycarrental.spring.dto.RegisteredUserDTO;
import com.esaycarrental.spring.entity.Rates;
import com.esaycarrental.spring.repo.RatesRepo;
import com.esaycarrental.spring.repo.RegisteredUserRepo;
import com.esaycarrental.spring.service.RatesService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Helitha Sri
 * @created 7/8/2022 - 2:08 PM
 * @project Easy Car Rental
 */

public class RatesServiceImpl implements RatesService {

    @Autowired
    private RatesRepo repo;

    @Autowired
    private ModelMapper mapper;


    @Override
    public List<RatesDTO> getAllRates() {
        return mapper.map(repo.findAll(), new TypeToken<List<RatesDTO>>(){}.getType());

    }
}
