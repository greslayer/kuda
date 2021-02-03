package com.gretskiy.kuda.web;

import com.gretskiy.kuda.model.Event;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Component
public class WebManagerImpl implements WebManager {
    private final Logger logger = LoggerFactory.getLogger(WebManagerImpl.class);
    private final RestTemplate restTemplate;

    public WebManagerImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @Override
    public Optional<Event> download(Long id,String fields) {
        logger.info("Requested from Kuda Go API Event with id = " + id);
        Event event = restTemplate.getForObject("https://kudago.com/public-api/v1.4/events/{id}/?fields={fields}", Event.class, id,fields);
        return Optional.ofNullable(event);
    }
}
