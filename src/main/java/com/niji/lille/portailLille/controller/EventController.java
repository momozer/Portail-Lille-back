package com.niji.lille.portailLille.controller;

import com.niji.lille.portailLille.entity.Category;
import com.niji.lille.portailLille.entity.Event;
import com.niji.lille.portailLille.servcie.EventService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/events")
public class EventController {

    private  final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("")
    public List<Event> findALl() {
        return eventService.findALl();
    }

    @PostMapping("")
    public Event save(@RequestBody Event entity ) {
        return eventService.save(entity);
    }

    @GetMapping("{dateTime}")
    public List<Event> findByDateTime(@PathVariable LocalDate dateTime) {
        return eventService.findByDateTime(dateTime);
    }

    @GetMapping("{category}")
    public List<Event> findByCategory(@PathVariable Category category) {
        return eventService.findByCategory(category);
    }

    @GetMapping("{id}")
    public Event findById(@PathVariable String id) {
        return eventService.findById(id);
    }


    @PatchMapping("{id}")
    public Event modifierById(@PathVariable String id, @RequestBody Event entity) {
        return eventService.modifierById(id, entity);
    }


    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id) {
        eventService.deleteById(id);
    }

}
