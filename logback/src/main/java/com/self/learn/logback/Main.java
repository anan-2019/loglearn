package com.self.learn.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName com.self.learn.logback.Main
 * @Author 51205
 * @Date 2023/8/8 0008 21:57
 * @Version 1.0
 * @Description Class Function Description Here
 */
public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("logback Demo");
    }
}
