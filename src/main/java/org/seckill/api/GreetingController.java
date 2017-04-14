package org.seckill.api;

import java.util.concurrent.atomic.AtomicLong;

import org.seckill.entity.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	
	 private static final String template = "Hello, %s!";
	    private final AtomicLong counter = new AtomicLong();

	    @RequestMapping(value="/greeting",method = RequestMethod.GET)
	    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
	        return new Greeting(counter.incrementAndGet(),
	                            String.format(template, name));
	    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreetingController o = new GreetingController();
		System.out.println("开始");
		o.aaa();
		System.out.println();
		System.out.println("结束");

	}

	public void aaa() {
		System.out.println();
		System.out.println("执行: " + Thread.currentThread().getStackTrace()[1]);
		System.out.println("方法: " + Thread.currentThread().getStackTrace()[2] + " 调用了  " + Thread.currentThread().getStackTrace()[1]);
		bbb();
	}

	public void bbb() {
		System.out.println();
		System.out.println("执行: " + Thread.currentThread().getStackTrace()[1]);
		System.out.println("方法: " + Thread.currentThread().getStackTrace()[2] + " 调用了  " + Thread.currentThread().getStackTrace()[1]);
		ccc();
	}

	public void ccc() {
		System.out.println();
		System.out.println("执行: " + Thread.currentThread().getStackTrace()[1]);
		System.out.println("方法: " + Thread.currentThread().getStackTrace()[2] + " 调用了  " + Thread.currentThread().getStackTrace()[1]);
		System.out.println("方法: " + Thread.currentThread().getStackTrace()[3] + " 调用了  " + Thread.currentThread().getStackTrace()[2]);
	}

}
