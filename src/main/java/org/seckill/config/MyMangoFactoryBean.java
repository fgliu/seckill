package org.seckill.config;

import javax.sql.DataSource;

import org.jfaster.mango.datasource.DriverManagerDataSource;
import org.jfaster.mango.operator.Mango;
import org.jfaster.mango.plugin.spring.AbstractMangoFactoryBean;

public class MyMangoFactoryBean extends AbstractMangoFactoryBean{

	 @Override
	    public Mango createMango() {
	        String driverClassName = "com.mysql.jdbc.Driver";
	        String url = "jdbc:mysql://localhost:3306/seckill";
	        String username = "root"; // 这里请使用您自己的用户名
	        String password = "root"; // 这里请使用您自己的密码
	        DataSource ds = new DriverManagerDataSource(driverClassName, url, username, password);
	        Mango mango = Mango.newInstance(ds); // 使用数据源初始化mango
	        return mango;
	    }
}
