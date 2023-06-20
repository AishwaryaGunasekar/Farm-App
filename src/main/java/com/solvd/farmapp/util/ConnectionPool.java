package com.solvd.farmapp.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class ConnectionPool {
	private final static Logger LOGGER = LogManager.getLogger(ConnectionPool.class);
	private static ConnectionPool connectionPool;
	private int numConnections;
	private Properties properties;
	private List<Connection> connections = new ArrayList<>();

	private ConnectionPool() {
		InputStream input;
		properties = new Properties();
		try {
			input = new FileInputStream("src/main/resources/db.properties");
			properties.load(input);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static ConnectionPool getInstance() {
		if (connectionPool == null) {
			connectionPool = new ConnectionPool();
		}
		return connectionPool;
	}

	public int getNumConnections() {
		return numConnections;
	}

	public Connection getConnection() {
		Connection connection;
		while (numConnections > 4) {
			LOGGER.info("Unable to get connection at this moment.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				LOGGER.error("Thread was unable to put to sleep");
				throw new RuntimeException(e);
			}
		}
		if (connections.isEmpty()) {
			try {
				connection = DriverManager.getConnection(properties.getProperty("DB_URL"),
						properties.getProperty("db.user"), properties.getProperty("DB_PASSWORD"));
				LOGGER.debug("Connection established .");
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		} else {
			LOGGER.debug("Successfully reused connection.");
			connection = connections.get(0);
			connections.remove(0);
		}
		addCounter();
		return connection;
	}

	public void releaseConnection(Connection connection) {
		connections.add(connection);
		if (numConnections > 0) {
			subtractCounter();
		}
		LOGGER.debug("Connection Successfully released");
	}

	public synchronized void addCounter() {
		numConnections++;
	}

	public synchronized void subtractCounter() {
		numConnections--;
	}
}
