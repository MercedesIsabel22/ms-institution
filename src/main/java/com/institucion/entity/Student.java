package com.institucion.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table("student")
public class Student {

    @Id
    private Long idStudent;
    private String names;
    private String firstSurname;
    private String secondSurname;
    private String type_document;
    private UserRole idUser;
    private Long idClassroom;
}
