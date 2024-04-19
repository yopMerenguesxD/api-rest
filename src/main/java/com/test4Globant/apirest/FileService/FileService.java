package com.test4Globant.apirest.FileService;

import com.test4Globant.apirest.entity.CSVs;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileService {

    CSVs guardar(MultipartFile archivo)throws IOException;
}
