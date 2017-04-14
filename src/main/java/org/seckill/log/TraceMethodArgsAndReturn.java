package org.seckill.log;

import static com.sun.btrace.BTraceUtils.*;
import com.sun.btrace.annotations.*;

/**
 * Created by andy on 13/04/2017.
 * 调用此方法时传入的是什么参数，返回的是什么值，当时sleepTotalTime是多少？
 */
@BTrace
public class TraceMethodArgsAndReturn {
    @OnMethod(
            clazz="org.seckill.log.CaseObject",
            method="execute",
            location=@Location(Kind.RETURN)
    )
    public static void traceExecute(@Self CaseObject instance,int sleepTime,@Return boolean result){
        println("call CaseObject.execute");
        println(strcat("sleepTime is:",str(sleepTime)));
        println(strcat("sleepTotalTime is:",str(get(field("org.seckill.log.CaseObject","sleepTotalTime"),instance))));
        println(strcat("return value is:",str(result)));
    }
}
