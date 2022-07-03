package com.hthx;

import com.hthx.controller.Logging;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test01 {

    public static final Logger LOGGER = LoggerFactory.getLogger(Test01.class);
    @Test
    public void test01(){
        LOGGER.error("error");
        LOGGER.warn("warn");
        LOGGER.info("info");
        LOGGER.debug("debug");
        LOGGER.trace("trace");
    }
}
