package com.gretskiy.kuda.service;

import com.gretskiy.kuda.model.Event;
import com.gretskiy.kuda.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class EventServiceImpl implements EventService {
    private final EventRepository eventRepository;
    private final EventSaver eventSaver;


    @Override
    public void save(Event event) {
        eventRepository.save(event);
    }

    @Override
    public Optional<Event> findById(Long id,String fields) {
        return eventRepository.findByEventId(id).or(()-> eventSaver.downloadAndSave(id,fields));
    }

    @Override
    public Event findWithParams(Set<String> params) {
        return null;
    }

}
