package org.seckill.log;

import static com.sun.btrace.BTraceUtils.*;

import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.*;

/**
 * Created by andy on 14/04/2017.
 */
@BTrace
public class Tracker {
    @OnMethod(
            clazz = "/org\\.seckill\\.log\\..*/",
            method = "/.*/",
            location = @Location(Kind.RETURN)
    )
    public static void trace(@ProbeClassName String pcn,
                             @ProbeMethodName String pmn,
                             @Duration long duration) {
        // duration的单位是纳秒
        if(duration > 3000000000l) {
            print(BTraceUtils.Strings.strcat("#Duration of ",
                    Strings.strcat(Strings.strcat(pcn, "."), pmn)));
            print(" is ");
            print(duration);
            println("#");
            jstack();
        }
    }
}
