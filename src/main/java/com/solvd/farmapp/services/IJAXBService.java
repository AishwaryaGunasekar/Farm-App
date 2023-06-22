package com.solvd.farmapp.services;

public interface IJAXBService<T> {
    void marshal(T t, String file, String className);
    T unmarshal(String file, String className);
}
