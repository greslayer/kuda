package com.gretskiy.kuda.controller;

import com.gretskiy.kuda.model.Event;
import com.gretskiy.kuda.service.EventService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;
import java.util.Set;

@RestController
public class EventController {
    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping(value = "get")
    public ResponseEntity<Event> getEvent(
            @RequestParam Long id,
            @RequestParam(required = false, defaultValue = "") String fields) {
        return ResponseEntity.of(eventService.findById(id,fields));
    }

    //TODO Params отдельно по одному
    public ResponseEntity<Event> getEventWithParams(@RequestParam Set<String> params) {
        return ResponseEntity.ok(eventService.findWithParams(params));
    }
    //TODO
    public ResponseEntity<Event> getCategories(){
        return null;
    }
    //TODO
    public ResponseEntity<Event> getEventsByCategory() {
        return getEventsByCategory(new Date());
    }
    //TODO
    public ResponseEntity<Event> getEventsByCategory(@RequestParam Date date){
        return null;
    }

}
