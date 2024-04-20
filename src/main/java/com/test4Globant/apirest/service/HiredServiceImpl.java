package com.test4Globant.apirest.service;

import com.test4Globant.apirest.entity.Hired;
import com.test4Globant.apirest.repository.HiredRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HiredServiceImpl implements HiredService {

    @Autowired
    HiredRepository hiredRepository;
    @Override
    public List<Hired> findAllHired() {
        return hiredRepository.findAll();
    }

    @Override
    public Hired saveHired(Hired hired) {
        return hiredRepository.save(hired);
    }

    @Override
    public List<Hired> saveListHired(List<Hired> lHired) {
        return hiredRepository.saveAll(lHired);
    }
}
