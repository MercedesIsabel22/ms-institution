package com.institucion.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table("notes")
public class Notes {

    @Id
    private Long idNote;
    private String numerico;
    private LocalDateTime createdAt;
    private String term;
    private Long idStudent;
    private Long course;

}
