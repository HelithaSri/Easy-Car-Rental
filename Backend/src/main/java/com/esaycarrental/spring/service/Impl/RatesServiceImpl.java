package com.esaycarrental.spring.service.Impl;

import com.esaycarrental.spring.dto.RatesDTO;
import com.esaycarrental.spring.entity.Rates;
import com.esaycarrental.spring.repo.RatesRepo;
import com.esaycarrental.spring.service.RatesService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Helitha Sri
 * @created 7/8/2022 - 2:08 PM
 * @project Easy Car Rental
 */

@Service
@Transactional
public class RatesServiceImpl implements RatesService {

    @Autowired
    private RatesRepo repo;

    @Autowired
    private ModelMapper mapper;


    @Override
    public void saveRates(RatesDTO ratesDTO) {
        if (!repo.existsById(ratesDTO.getRateId())) {
            repo.save(mapper.map(ratesDTO, Rates.class));
        } else {
            throw new RuntimeException("Rate Already Exist");
        }
    }

    @Override
    public void deleteRates(String rateID) {
        if (repo.existsById(rateID)) {
            repo.deleteById(rateID);
        } else {
            throw new RuntimeException("Please check the Rate ID... No Such Rate to Delete!");
        }
    }

    @Override
    public void updateRates(RatesDTO ratesDTO) {
        if (repo.existsById(ratesDTO.getRateId())) {
            repo.save(mapper.map(ratesDTO, Rates.class));
        } else {
            throw new RuntimeException("Please check the Rate ID... No Such Rate to Update!");
        }
    }

    @Override
    public List<RatesDTO> getAllRates() {
        return mapper.map(repo.findAll(), new TypeToken<List<RatesDTO>>() {
        }.getType());

    }
}
