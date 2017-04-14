package org.seckill.log;

/**
 * Created by andy on 13/04/2017.
 */
public class CaseObject {

    private static int sleepTotalTime=0;

    public boolean execute(int sleepTime) throws Exception{
        System.out.println("sleep: "+sleepTime);
        sleepTotalTime+=sleepTime;
        Thread.sleep(sleepTime);
        return true;
    }


}
