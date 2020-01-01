package com.jiajunwei.senior1.week1.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jiajunwei.senior1.week1.domain.Brand;
import com.jiajunwei.senior1.week1.domain.Goods;
import com.jiajunwei.senior1.week1.domain.Goodskind;
import com.jiajunwei.senior1.week1.domain.Goodss;
import com.jiajunwei.senior1.week1.service.GoodsService;

@Controller
public class GoodsController {

	@Autowired
	GoodsService service;
	@RequestMapping("list")
	public String list(Goods g,@RequestParam(defaultValue = "1")int pageNum,Model m) {
		PageHelper.startPage(pageNum, 2);
		List<Goods> list = service.list(g);
		PageInfo<Goods> pageInfo = new  PageInfo<Goods>(list);
		m.addAttribute("list", list);
		m.addAttribute("g", g);
		m.addAttribute("pg", pageInfo);
		return "list";
	}
	@RequestMapping("add")
	public String add() {
		
		
		return "add";
	}
	@RequestMapping("brand")
	@ResponseBody
	List<Brand> brand(){
		
		return service.brand();
	}
	@RequestMapping("kind")
	@ResponseBody
	List<Goodskind> kind(){
		
		return service.kind();
	}
	@RequestMapping("tian")
	@ResponseBody
	public boolean tain(Goods g,MultipartFile file) throws IllegalStateException, IOException {
		if(file!=null && !file.isEmpty()) {
			String path="D:/week1/";
			String originalFilename = file.getOriginalFilename();
		    String fileName=UUID.randomUUID()+originalFilename.substring(originalFilename.lastIndexOf("."));
		    File file2 = new File(path+fileName);
		    file.transferTo(file2);
		    g.setDfilev(fileName);
		}
		int add = service.add(g);
		
		return add>0;
	}
	@RequestMapping("xiu")
	public String xiu(int id,Model m) {
		
		Goods xiu = service.xiu(id);
		m.addAttribute("g", xiu);
		return "update";
	}
	@RequestMapping("update")
	@ResponseBody
	public boolean update(Goods g,MultipartFile file) throws IllegalStateException, IOException {
		if(file!=null && !file.isEmpty()) {
			String path="D:/week1/";
			String originalFilename = file.getOriginalFilename();
		    String fileName=UUID.randomUUID()+originalFilename.substring(originalFilename.lastIndexOf("."));
		    File file2 = new File(path+fileName);
		    file.transferTo(file2);
		    g.setDfilev(fileName);
		}
		int update = service.update(g);
		return update>0;
	}
	@RequestMapping("shan")
	@ResponseBody
	public  boolean shan(int id) {
		service.shan(id);
		return true;
	}
	@RequestMapping("xiang")
	public String xiang(int id,Model m) {
		Goodss xiang = service.xiang(id);
		m.addAttribute("g", xiang);
		return "xiang";
	}
	@RequestMapping("pishan")
	public String pishan(String id) {
		System.out.println(id+"===");
		int pi = service.pi(id);
		
		return "list";
				
	}
}
