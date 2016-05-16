package org.seckill;

import org.seckill.service.ConsumingRest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainApplication {
	
	private static final Logger log = LoggerFactory.getLogger(MainApplication.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConsumingRest cr = new ConsumingRest();
		cr.getApiRest();
		
		     
//		log.debug("welcome() is executed, value {}", "mkyong");
				
//		log.error("This is Error message", new Exception("Testing"));
//		RelationalDataAccess red = new RelationalDataAccess();
//		red.getDataAccess();
	}

}
