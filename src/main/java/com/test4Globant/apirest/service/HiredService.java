package com.test4Globant.apirest.service;

import com.test4Globant.apirest.entity.Hired;

import java.util.List;

public interface HiredService {
    List<Hired> findAllHired();
    Hired saveHired(Hired hired);
    List<Hired> saveListHired(List<Hired> lHired);
}
