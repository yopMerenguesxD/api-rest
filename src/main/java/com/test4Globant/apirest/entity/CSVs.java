package com.test4Globant.apirest.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Table(name ="CSVTable")
@Entity
@Builder
public class CSVs {

    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String extencion;
    @Lob
    private byte [] data;
}
