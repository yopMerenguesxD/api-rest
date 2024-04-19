package com.test4Globant.apirest.repository;

import com.test4Globant.apirest.entity.CSVs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FileRepository extends JpaRepository<CSVs, UUID> {
}
