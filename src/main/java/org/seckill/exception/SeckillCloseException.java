package org.seckill.exception;

import org.seckill.dto.*;

/**
 * 秒杀关闭异常
 * Created by andy on 16/7/14.
 */
public class SeckillCloseException extends SeckillException {

    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
