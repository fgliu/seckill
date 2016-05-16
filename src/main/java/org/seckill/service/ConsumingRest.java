package org.seckill.service;

import org.seckill.entity.Quote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumingRest {
	
	private static final Logger log = LoggerFactory.getLogger(ConsumingRest.class);

	public void getApiRest(){
		 RestTemplate restTemplate = new RestTemplate();
	     Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
	     log.info(quote.toString());
	     
	     log.debug("welcome() is executed, value {}", "mkyong");
			
	     log.error("This is Error message", new Exception("Testing"));
	}
	

}
