package com.gretskiy.kuda.service;


import com.gretskiy.kuda.model.Event;

import java.util.Set;

public interface EventService {
    void save(Event event);

    Event findById(Long id);
    Event findWithParams(Set<String> params);
}
