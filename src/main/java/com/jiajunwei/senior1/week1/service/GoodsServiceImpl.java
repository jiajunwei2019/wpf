package com.jiajunwei.senior1.week1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiajunwei.senior1.week1.dao.GoodsDao;
import com.jiajunwei.senior1.week1.domain.Brand;
import com.jiajunwei.senior1.week1.domain.Goods;
import com.jiajunwei.senior1.week1.domain.Goodskind;
import com.jiajunwei.senior1.week1.domain.Goodss;

@Service
public class GoodsServiceImpl implements GoodsService{

	
	@Autowired
	GoodsDao dao;

	public List<Goods> list(Goods g) {
		// TODO Auto-generated method stub
		return dao.list(g);
	}

	public List<Brand> brand() {
		// TODO Auto-generated method stub
		return dao.brand();
	}

	public List<Goodskind> kind() {
		// TODO Auto-generated method stub
		return dao.kind();
	}

	public int add(Goods g) {
		// TODO Auto-generated method stub
		return dao.add(g);
	}

	public Goods xiu(int id) {
		// TODO Auto-generated method stub
		return dao.xiu(id);
	}

	public int update(Goods g) {
		// TODO Auto-generated method stub
		return dao.update(g);
	}

	public int shan(int id) {
		// TODO Auto-generated method stub
		return dao.shan(id);
	}

	public Goodss xiang(int id) {
		// TODO Auto-generated method stub
		return dao.xiang(id);
	}

	public int pi(String id) {
		// TODO Auto-generated method stub
		return dao.pi(id);
	}
	
	
}
