package org.seckill.log;


import org.slf4j.Logger;

/**
 * Created by andy on 13/04/2017.
 */
public class TestLog {

    private static Logger slf4jlog = org.seckill.log.LoggerFactory.getLogger(TestLog.class.getName());


    public static void main(String[] args) {
        slf4jlog.debug("原有日志测试");
        TestLog l = new TestLog();
        l.aaa();
//        org.seckill.log.LoggerFactory.getLogger().debug("改造后日志测试");
    }

    public void aaa() {
        System.out.println("my name is aaa");
        bbb();
        org.seckill.log.LoggerFactory.getLogger().debug("改造后日志测试");
    }

    public void bbb() {
        System.out.println("my name is bbb");
        ccc();
    }

    public void ccc() {
        System.out.println("my name is ccc");
    }

}
