package com.jiajunwei.senior1.week1.service;

import java.util.List;

import com.jiajunwei.senior1.week1.domain.Brand;
import com.jiajunwei.senior1.week1.domain.Goods;
import com.jiajunwei.senior1.week1.domain.Goodskind;
import com.jiajunwei.senior1.week1.domain.Goodss;

public interface GoodsService {

	List<Goods> list(Goods g);
	List<Brand> brand();
	List<Goodskind> kind();
	public int add(Goods g);
	Goods xiu(int id);
	int update(Goods g);
	int shan(int id);
	Goodss xiang(int id);
	int pi(String id);
}
