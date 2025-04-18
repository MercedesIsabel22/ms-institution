package com.institucion.repository;

import com.institucion.entity.Teacher;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface TeacherRepository extends ReactiveCrudRepository<Teacher, Long> {
}
