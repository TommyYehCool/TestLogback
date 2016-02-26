package com.syscom.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLogback {
	private static final Logger logger = LoggerFactory.getLogger("com.syscom.vip");

	public static void main(String[] args) {
		logger.info("Hello logback");
	}
}
