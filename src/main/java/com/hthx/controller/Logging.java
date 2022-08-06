package com.hthx.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logging {

    public static final Logger LOGGER = LoggerFactory.getLogger(Logging.class);

    public static void main(String[] args) {
        LOGGER.error("error");
        LOGGER.warn("warn");
        LOGGER.info("info");
        LOGGER.debug("debug");
        11123
    }
}
