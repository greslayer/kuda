package com.gretskiy.kuda.service;


import com.gretskiy.kuda.model.Event;

public interface EventDownloader {
    void save(Event event);

    Event findById(Long id);
}
