package com.epam.app;

import org.apache.log4j.Logger;

public class App {

	private static final Logger logger = Logger.getLogger(App.class);
	private static final String LOG_STRING = "Hello World!!!";

	public static void main(String[] args) {

		logger.info(LOG_STRING);
		logger.debug(LOG_STRING);

	}

}
