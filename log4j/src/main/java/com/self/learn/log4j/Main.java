package com.self.learn.log4j;

import org.apache.log4j.Logger;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

/**
 * @ClassName com.self.learn.log4j.Main
 * @Author 51205
 * @Date 2023/8/8 0008 21:40
 * @Version 1.0
 * @Description Class Function Description Here
 */
public class Main {
    private static Logger logger = Logger.getLogger(Main.class);
//    private static Logger logger = LoggerFactory.getLogger(com.self.learn.log4j.Main.class);

    public static void main(String[] args) {
        logger.info("log4j Demo");
    }
}
