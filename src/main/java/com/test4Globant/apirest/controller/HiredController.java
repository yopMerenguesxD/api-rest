package com.test4Globant.apirest.controller;

import com.test4Globant.apirest.entity.Hired;
import com.test4Globant.apirest.service.HiredService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HiredController {

    @Autowired
    HiredService hiredService;

    @GetMapping("/findAllHired")
    public List<Hired> findAllHired(){
        return  hiredService.findAllHired();
    }

    @PostMapping("/saveHired")
    public Hired saveHired(@RequestBody Hired hired){
        return hiredService.saveHired(hired);
    }

    @PostMapping("/savelHired")
    public List<Hired> saveHiredL(@RequestBody List<Hired> lhired){
        return hiredService.saveListHired(lhired);
    }
}
