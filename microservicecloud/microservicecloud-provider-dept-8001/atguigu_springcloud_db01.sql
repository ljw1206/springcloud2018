DROP DATABASE IF EXISTS atguigu_springcloud_db01;
CREATE DATABASE atguigu_springcloud_db01 CHARACTER SET UTF8;
USE atguigu_springcloud_db01;
CREATE TABLE dept
(
	deptno BIGINT NOT NULL PRIMARY KEY auto_increment,
	dname VARCHAR(60),
	db_source VARCHAR(60)
);

INSERT INTO dept(dname, db_source) VALUES('开发部',DATABASE());
INSERT INTO dept(dname, db_source) VALUES('人事部',DATABASE());
INSERT INTO dept(dname, db_source) VALUES('财务部',DATABASE());
INSERT INTO dept(dname, db_source) VALUES('市场部',DATABASE());
INSERT INTO dept(dname, db_source) VALUES('运维部',DATABASE());

select * from dept;
