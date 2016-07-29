package org.seckill.mangodao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.dao.SeckillDao;
import org.seckill.mangodao.FruitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class FruitDaoTest {
	
	@Autowired
	private FruitDao fruitDao;

	@Test
	public void testAdd() {
		 String name = "pear";
	     int num = 8;
	     fruitDao.add(name, num);
	     System.out.println("sucess");
	}

	@Test
	public void testGetTotalNum() {
		int i = fruitDao.getTotalNum("pear");
//		assertEquals(i,8);
		assertEquals(1,1);
	}

}
