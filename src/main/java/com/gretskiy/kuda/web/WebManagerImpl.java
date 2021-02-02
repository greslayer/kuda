package com.gretskiy.kuda.web;

import com.gretskiy.kuda.model.Event;
import com.gretskiy.kuda.repository.EventRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.HashMap;
import java.util.Map;

@Component
public class WebManagerImpl implements WebManager {
    private final EventRepository eventRepository;
    private final Logger logger = LoggerFactory.getLogger(WebManagerImpl.class);
    private final RestTemplate restTemplate = new RestTemplate();
    //TODO что это?

    public WebManagerImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public Event downloadAndSave(Long id) {
        logger.info("Requested from Kuda Go API Event with id = "+id);
        //TODO как закинуть в запрос
        Event event= restTemplate.getForObject("https://kudago.com/public-api/v1.4/events/{id}/",Event.class,id);
//        if (event==null){
//            logger.info("Didn't get an answer for id: "+id);
//            return new Event();
//        } else {
//            eventRepository.save(event);
//            return event;
//        }
        return event;
        //TODO .getforEntity и возвращать ResponseEntity? или optional?
    }
}
