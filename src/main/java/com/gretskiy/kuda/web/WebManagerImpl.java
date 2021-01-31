package com.gretskiy.kuda.web;

import com.gretskiy.kuda.model.Event;
import org.springframework.stereotype.Component;

import java.util.function.Supplier;
@Component
public class WebManagerImpl implements WebManager {
    @Override
    public Event downloadAndSave(Long id) {
        return new Event();
    }
}
