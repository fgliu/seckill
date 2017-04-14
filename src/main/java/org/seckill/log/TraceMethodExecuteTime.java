package org.seckill.log;

import static com.sun.btrace.BTraceUtils.*;
import com.sun.btrace.annotations.*;

/**
 * Created by andy on 14/04/2017.
 * execute方法执行耗时是多久？
 */
@BTrace
public class TraceMethodExecuteTime {

    @TLS static long beginTime;

    @OnMethod(
            clazz="org.seckill.log.CaseObject",
            method="execute"
    )
    public static void traceExecuteBegin(){
        beginTime=timeMillis();
    }

    @OnMethod(
            clazz="org.seckill.log.CaseObject",
            method="execute",
            location=@Location(Kind.RETURN)
    )
    public static void traceExecute(int sleepTime,@Return boolean result){
        println(strcat(strcat("CaseObject.execute time is:",str(timeMillis()-beginTime)),"ms"));
    }
}
