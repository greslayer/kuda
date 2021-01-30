package com.gretskiy.kuda.controller;

import com.gretskiy.kuda.model.Event;
import com.gretskiy.kuda.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {
    private final EventRepository eventRepository;

    public EventController(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }
    @RequestMapping(value = "save")
    public void saveEvent(@ModelAttribute Event event){
        eventRepository.save(event);
    }
    @RequestMapping(value = "get")
    public Event getEvent(@RequestParam Long id){
        return eventRepository.findById(id).orElse(new Event());
    }
}
