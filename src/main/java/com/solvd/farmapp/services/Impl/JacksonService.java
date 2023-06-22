package com.solvd.farmapp.services.Impl;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.solvd.farmapp.bin.Crops;
import com.solvd.farmapp.services.IJacksonService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.File;
import java.io.IOException;

public class JacksonService<T> implements IJacksonService<T> {
	private final static Logger LOGGER = LogManager.getLogger(JacksonService.class);

	@Override
	public void serialize(T t, String file) {
		ObjectMapper objectMapper = new ObjectMapper().configure(SerializationFeature.WRAP_ROOT_VALUE, true);
		objectMapper.registerModule(new JavaTimeModule());
		try {
			objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(file), t);
		} catch (IOException e) {
			LOGGER.error("File not found.");
			throw new RuntimeException(e);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public T deserialize(String file, String className) {
		T t;
		Class<T> tClass;
		try {
			tClass = (Class<T>) Class.forName(className);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
		ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
		objectMapper.registerModule(new JavaTimeModule());
		try {
			t = objectMapper.readValue(new File(file), tClass);
		} catch (IOException e) {
			LOGGER.error("File not found.");
			throw new RuntimeException(e);
		}
		return t;
	}

	public static Crops deserialize(String jsonFile) {
		// TODO Auto-generated method stub
		return null;
	}
}
