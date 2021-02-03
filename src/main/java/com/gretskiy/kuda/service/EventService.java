package com.gretskiy.kuda.service;


import com.gretskiy.kuda.model.Event;

import java.util.Optional;
import java.util.Set;

public interface EventService {
    void save(Event event);

    Optional<Event> findById(Long id,String fields);
    Event findWithParams(Set<String> params);
}
