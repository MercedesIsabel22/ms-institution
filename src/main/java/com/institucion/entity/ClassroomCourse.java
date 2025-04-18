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
@Table("classroom_Course")
public class ClassroomCourse {

    @Id
    private Long id;
    private Long idClassRoom;
    private Long idCourse;
    private Long idTeacher;
}
