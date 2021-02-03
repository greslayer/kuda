package com.gretskiy.kuda.service;

import com.gretskiy.kuda.model.Event;
import com.gretskiy.kuda.repository.EventRepository;
import com.gretskiy.kuda.web.WebManager;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Optional;

@RequiredArgsConstructor
@Component
public class EventSaverImpl implements EventSaver {
    private final Logger logger = LoggerFactory.getLogger(EventSaverImpl.class);
    private final WebManager webManager;
    private final EventRepository eventRepository;

    @Override
    public Optional<Event> downloadAndSave(Long id,String fields) {
        Optional<Event> download = webManager.download(id,fields);
        download.ifPresent(this::save);
        return download;
    }

    private void save(Event event) {
        eventRepository.save(event);
        logger.info("Saved event with id: " + event.getEventId());
    }
}
