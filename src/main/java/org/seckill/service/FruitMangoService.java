package org.seckill.service;

import javax.sql.DataSource;

import org.jfaster.mango.datasource.DriverManagerDataSource;
import org.jfaster.mango.operator.Mango;
import org.seckill.mangodao.FruitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FruitMangoService {
	
	@Autowired
	FruitDao dao;
	
	public void insert(){
        String name = "apple";
        int num = 7;
        dao.add(name, num);
        System.out.println(dao.getTotalNum(name));
		
	}
	
	public static void main(String[] args) {
//		String configLocation = "/spring/spring-dao.xml";
//	    ApplicationContext ctx = new ClassPathXmlApplicationContext(configLocation);
//	    FruitDao d = ctx.getBean(FruitDao.class);
//	    String name = "apple";
//        int num = 7;
//        d.add(name, num);
//        System.out.println(d.getTotalNum(name));
//	    System.out.println(ctx.getBean(FruitDao.class) != null);
		
		String driverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/mango_example";
        String username = "root"; // 这里请使用您自己的用户名
        String password = "root"; // 这里请使用您自己的密码
        DataSource ds = new DriverManagerDataSource(driverClassName, url, username, password);
        Mango mango = Mango.newInstance(ds); // 使用数据源初始化mango

        FruitDao dao = mango.create(FruitDao.class);
        String name = "apple";
        int num = 7;
        dao.add(name, num);
        System.out.println(dao.getTotalNum(name));
	}

}
