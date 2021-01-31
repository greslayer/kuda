package com.gretskiy.kuda.web;

import com.gretskiy.kuda.model.Event;

import java.util.function.Supplier;

public interface WebManager {
    Event downloadAndSave(Long id);
}
