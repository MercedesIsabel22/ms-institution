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
@Table("teacher")
public class Teacher {

    @Id
    private Long idTeacher;
    private String firstSurname;
    private String secondSurname;
    private String typeDocument;
    private String documentNumber;
    private Long User;

}
