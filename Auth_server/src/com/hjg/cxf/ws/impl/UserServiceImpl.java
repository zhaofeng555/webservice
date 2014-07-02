package com.hjg.cxf.ws.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hjg.cxf.model.Cat;
import com.hjg.cxf.model.User;
import com.hjg.cxf.ws.UserService;

public class UserServiceImpl implements UserService {

	static Map<User, List<Cat>> catDb=new HashMap<User, List<Cat>>();
	
	static{
		List<Cat> catList1 = new ArrayList<Cat>();
		catList1.add(new Cat(1, "katt","橙色"));
		catList1.add(new Cat(2, "机器猫","蓝色"));
		catDb.put(new User(1, "sun","1122","北京"), catList1);
		
		List<Cat> catList2 = new ArrayList<Cat>();
		catList2.add(new Cat(3, "kitty","黑色"));
		catList2.add(new Cat(4, "熊猫","白色"));
		catDb.put(new User(2, "orc","2233","上海"), catList2);
	}
	
	@Override
	public List<Cat> getCatsByUser(User user) {
		return catDb.get(user);
	}

	@Override
	public Map<String, Cat> getCats() {
		Map<String, Cat> result = new HashMap<String, Cat>();
		int i=1;
		for(List<Cat> cats : catDb.values()){
			for(Cat c : cats){
				result.put("第"+(i++)+"个", c);
			}
		}
		return result;
	}

}