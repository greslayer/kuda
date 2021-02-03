package com.gretskiy.kuda.web;

import com.gretskiy.kuda.model.Event;

import java.util.Optional;


public interface WebManager {
    Optional<Event> download(Long id,String fields);
}
