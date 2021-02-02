package com.gretskiy.kuda.repository;

import com.gretskiy.kuda.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EventRepository extends JpaRepository<Event,Long> {
    Optional<Event> findByEventId(Long id);
}
