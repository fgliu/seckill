package org.seckill.log;

import static com.sun.btrace.BTraceUtils.*;
import com.sun.btrace.annotations.*;

/**
 * Created by andy on 14/04/2017.
 * 有没有人调用CaseObject中的哪一行代码？
 */
@BTrace
public class TraceMethodLine {

    @OnMethod(
            clazz="org.seckill.log.CaseObject",
            location=@Location(value=Kind.LINE,line=5)
    )
    public static void traceExecute(@ProbeClassName String pcn,@ProbeMethodName String pmn,int line){
        println(strcat(strcat(strcat("call ",pcn),"."),pmn));
    }
}
