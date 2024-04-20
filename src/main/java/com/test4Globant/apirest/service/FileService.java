package com.test4Globant.apirest.service;

import com.test4Globant.apirest.entity.CSV;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileService {

    CSV store(MultipartFile archivo)throws IOException;
}
