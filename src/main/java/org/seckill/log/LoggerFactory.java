package org.seckill.log;

import org.slf4j.Logger;

/**
 * Created by andy on 13/04/2017.
 */
public class LoggerFactory {
    /**
     * 根据线程自动获取类名称
     */
    public static Logger getLogger() {
        StackTraceElement[] el = Thread.currentThread().getStackTrace();
        if (el != null && el[2] != null)
            return org.slf4j.LoggerFactory.getLogger(el[2].getClassName());
        return org.slf4j.LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
    }

    /**
     * 针对同名类LoggerFactory重写getLogger方法
     */
    public static Logger getLogger(String name) {
        return org.slf4j.LoggerFactory.getLogger(name);
    }
}
