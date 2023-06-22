package com.solvd.farmapp.services;

public interface IJacksonService<T> {
    void serialize(T t, String file);
    T deserialize(String file, String className);
}
