package com.atguigu.springcloud.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.atguigu.springcloud.entities.Dept;

import feign.hystrix.FallbackFactory;

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService>{

	@Override
	public DeptClientService create(Throwable arg0) {
		return new DeptClientService() {
			
			@Override
			public List<Dept> list() {
				return null;
			}
			
			@Override
			public Dept get(Long id) {
				return new Dept().setDepno(id).setDname("该ID：" + id + "没有对应的信息,Consumer客户端提供的降级信息，此刻服务Provider已经关闭")
						.setDb_source("no this database in MySQL");
			}
			
			@Override
			public boolean add(Dept dept) {
				return false;
			}
		};
	}

}
