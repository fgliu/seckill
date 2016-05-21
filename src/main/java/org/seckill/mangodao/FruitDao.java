package org.seckill.mangodao;

import org.jfaster.mango.annotation.DB;
import org.jfaster.mango.annotation.SQL;

@DB
public interface FruitDao {
	
	// 插入数据
    @SQL("insert into fruit(name, num) values(:1, :2)")
    public void add(String name, int num);

     // 根据name取num的总和
    @SQL("select sum(num) from fruit where name=:1")
    public int getTotalNum(String name);

}
