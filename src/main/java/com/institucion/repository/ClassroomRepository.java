package com.institucion.repository;

import com.institucion.entity.Classroom;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ClassroomRepository extends ReactiveCrudRepository<Classroom, Long> {
}
