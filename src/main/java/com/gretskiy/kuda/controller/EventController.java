package com.gretskiy.kuda.controller;

import com.gretskiy.kuda.model.Event;
import com.gretskiy.kuda.repository.EventRepository;
import com.gretskiy.kuda.service.EventDownloader;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {
    private final EventDownloader eventService;

    public EventController(EventDownloader eventService) {
        this.eventService = eventService;
    }
    @RequestMapping(value = "save")
    public void saveEvent(@ModelAttribute Event event){
        eventService.save(event);
    }
    @RequestMapping(value = "get")
    public Event getEvent(@RequestParam Long id){
        return eventService.findById(id);
    }
}
