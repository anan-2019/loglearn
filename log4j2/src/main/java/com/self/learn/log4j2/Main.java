package com.self.learn.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

/**
 * @ClassName com.self.learn.log4j2.Main
 * @Author 51205
 * @Date 2023/8/8 0008 21:49
 * @Version 1.0
 * @Description Class Function Description Here
 */
public class Main {
    private static Logger logger = LogManager.getLogger(Main.class);
//    private static Logger logger = LoggerFactory.getLogger(com.self.learn.log4j2.Main.class);

    public static void main(String[] args) {
        logger.info("log4j2 Demo");
    }
}
