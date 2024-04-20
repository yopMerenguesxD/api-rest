package com.test4Globant.apirest.service;

import com.test4Globant.apirest.entity.CSV;
import com.test4Globant.apirest.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class FileServiceImpl implements  FileService{

    @Autowired
    private FileRepository fileRepository;
    @Override
    public CSV store(MultipartFile archivo)throws IOException{
        String name = StringUtils.cleanPath(archivo.getOriginalFilename());
        CSV csv = CSV.builder().name(name).extencion(archivo.getContentType()).data(archivo.getBytes()).build();

        return fileRepository.save(csv);
    }



}
