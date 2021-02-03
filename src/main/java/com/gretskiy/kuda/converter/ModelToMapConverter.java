package com.gretskiy.kuda.converter;

import java.util.Collection;
import java.util.Map;

public interface ModelToMapConverter<T> {
    Map<String,String> convert(T model, Collection<String> fields);
}
