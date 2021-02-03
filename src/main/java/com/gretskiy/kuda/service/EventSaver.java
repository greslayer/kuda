package com.gretskiy.kuda.service;

import com.gretskiy.kuda.model.Event;

import java.util.Optional;

public interface EventSaver {
    Optional<Event> downloadAndSave(Long id,String fields);
}
