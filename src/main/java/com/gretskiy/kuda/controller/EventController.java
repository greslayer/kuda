package com.gretskiy.kuda.controller;

import com.gretskiy.kuda.model.Event;
import com.gretskiy.kuda.service.EventService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Set;

@RestController
public class EventController {
    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping(value = "get")
    public ResponseEntity<Event> getEvent(@RequestParam Long id) {
        return ResponseEntity.ok(eventService.findById(id));
    }

    //TODO легально?, как передать в RestTemplate
    //TODO Params отдельно по одному
    public ResponseEntity<Event> getEventWithParams(@RequestParam Set<String> params) {
        return ResponseEntity.ok(eventService.findWithParams(params));
    }

}
