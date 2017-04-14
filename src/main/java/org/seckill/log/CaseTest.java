package org.seckill.log;

import java.util.Random;

/**
 * Created by andy on 13/04/2017.
 */
public class CaseTest {
    public static void main(String[] args) throws Exception{
        Random random=new Random();
        CaseObject object=new CaseObject();
        boolean result=true;
        while(result){
            result=object.execute(random.nextInt(1000));
            Thread.sleep(1000);
        }
    }
}



