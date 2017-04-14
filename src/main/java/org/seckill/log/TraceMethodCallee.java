package org.seckill.log;

import static com.sun.btrace.BTraceUtils.*;
import com.sun.btrace.annotations.*;
/**
 * Created by andy on 14/04/2017.
 * 谁调用了execute方法？
 */
@BTrace
public class TraceMethodCallee {

    @OnMethod(
            clazz="CaseObject",
            method="execute"
    )
    public static void traceExecute(){
        println("who call CaseObject.execute :");
        jstack();
    }
}
