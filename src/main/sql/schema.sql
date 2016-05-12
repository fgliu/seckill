
create database seckill;

use seckill;

create table seckill(
`seckill_id` bigint not null AUTO_INCREMENT COMMENT '商品库存表主键',
`name` VARCHAR(120) not null COMMENT '商品表名称',
`number` int not null COMMENT '库存数量',
`start_time` timestamp not null COMMENT '秒杀开始时间',
`end_time` timestamp not null COMMENT '秒杀结束时间',
`create_time` timestamp not null default CURRENT_TIMESTAMP COMMENT '创建时间',
PRIMARY KEY(seckill_id),
key idx_start_time(start_time),
key idx_end_time(end_time),
key idx_create_time(create_time)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT '秒杀库存表';

insert into 
	seckill(name,number,start_time,end_time)
values
	('1000元秒杀iphone6',100,'2016-05-09 00:00:00','2016-05-10 00:00:00'),
	('500元秒杀ipad2',200,'2016-05-09 00:00:00','2016-05-10 00:00:00'),
	('300元秒杀小米4',300,'2016-05-09 00:00:00','2016-05-10 00:00:00'),
	('200元秒杀红米note',400,'2016-05-09 00:00:00','2016-05-10 00:00:00');
	

create table success_killed(
seckill_id bigint not null COMMENT '秒杀商品id',
user_phone bigint not null COMMENT '用户手机号',
state tinyint not null default -1 COMMENT '状态标示：-1：无效   0：成功  1：已付款 ',
create_time timestamp not null COMMENT '创建时间',
primary key (seckill_id,user_phone),
key idx_create_time(create_time)
)engine=InnoDB default CHARSET=UTF8 COMMENT '秒杀成功明细表';