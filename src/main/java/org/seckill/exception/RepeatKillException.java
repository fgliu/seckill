package org.seckill.exception;

import org.seckill.dto.*;

/**
 * 重复秒杀异常（运行期异常）
 * Created by andy on 16/7/14.
 */
public class RepeatKillException extends SeckillException {

    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}
