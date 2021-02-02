package com.gretskiy.kuda.service;

import com.gretskiy.kuda.model.Event;
import com.gretskiy.kuda.repository.EventRepository;
import com.gretskiy.kuda.web.WebManager;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class EventServiceImpl implements EventService {
    private final EventRepository eventRepository;
    private final WebManager webManager;

    public EventServiceImpl(EventRepository eventRepository, WebManager webManager) {
        this.eventRepository = eventRepository;
        this.webManager = webManager;
    }

    @Override
    public void save(Event event) {
        eventRepository.save(event);
    }

    @Override
    public Event findById(Long id) {
        return eventRepository.findByEventId(id).orElseGet(()->webManager.downloadAndSave(id));
    }

    @Override
    public Event findWithParams(Set<String> params) {
        return null;
    }

}
