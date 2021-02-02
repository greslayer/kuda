package com.gretskiy.kuda.web;

import com.gretskiy.kuda.model.Event;


public interface WebManager {
    Event downloadAndSave(Long id);
}
