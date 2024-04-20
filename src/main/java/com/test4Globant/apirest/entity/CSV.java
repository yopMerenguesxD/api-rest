package com.test4Globant.apirest.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


import java.util.UUID;

@Table(name ="CSVTable")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CSV {

    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String extencion;
    @Lob
    private byte [] data;
}
