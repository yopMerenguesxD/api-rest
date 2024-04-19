package com.test4Globant.apirest.FileService;

import com.test4Globant.apirest.entity.CSVs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class FileServiceImpl implements  FileService{

    @Autowired
    @Override
    public CSVs guardar(MultipartFile archivo)throws IOException{

    }



}
