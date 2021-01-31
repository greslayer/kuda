package com.gretskiy.kuda.service;

import com.gretskiy.kuda.model.Event;
import com.gretskiy.kuda.repository.EventRepository;
import com.gretskiy.kuda.web.WebManager;
import org.springframework.stereotype.Service;

@Service
public class EventDownloaderImpl implements EventDownloader {
    private final EventRepository eventRepository;
    private final WebManager webManager;

    public EventDownloaderImpl(EventRepository eventRepository, WebManager webManager) {
        this.eventRepository = eventRepository;
        this.webManager = webManager;
    }

    @Override
    public void save(Event event) {
        eventRepository.save(event);
    }

    @Override
    public Event findById(Long id) {
        return eventRepository.findById(id).orElseGet(()->webManager.downloadAndSave(id));
    }
}
