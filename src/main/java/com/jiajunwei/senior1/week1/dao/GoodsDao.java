package com.jiajunwei.senior1.week1.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import com.jiajunwei.senior1.week1.domain.Brand;
import com.jiajunwei.senior1.week1.domain.Goods;
import com.jiajunwei.senior1.week1.domain.Goodskind;
import com.jiajunwei.senior1.week1.domain.Goodss;

public interface GoodsDao {

	List<Goods> list(Goods g);
	List<Brand> brand();
	List<Goodskind> kind();
	@Insert("insert into tb_goods values(0,#{name},#{ename},#{bid},#{lid},#{chi},#{dj},#{sj},#{bq},#{dfilev})")
	int add(Goods g);
	Goods xiu(@Param("id") int id);
	@Update("update tb_goods set name=#{name},ename=#{ename},bid=#{bid},lid=#{lid},chi=#{chi},dj=#{dj},sj=#{sj},bq=#{bq},dfilev=#{dfilev} where id =#{id}")
	int update(Goods g);
	@Delete("delete from tb_goods where id=#{id}")
	int shan(int id);
	Goodss xiang(int id);
	@Delete("delete from tb_goods where id in (${jid})")
	int pi(@Param("jid") String jid);
	
}
