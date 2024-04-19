package com.test4Globant.apirest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Table(name ="clients")
@Entity
@Builder
public class employees {

    @Id
    private int id;
    private String name;
    private Date datetime;
    private int department_id;
    private int job_id;
}
