package com.gretskiy.kuda.repository;

import com.gretskiy.kuda.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event,Long> {
}
