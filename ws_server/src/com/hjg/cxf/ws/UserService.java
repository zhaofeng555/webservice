package com.hjg.cxf.ws;

import java.util.List;
import java.util.Map;

import com.hjg.cxf.model.Cat;
import com.hjg.cxf.model.User;

public interface UserService {
	
	List<Cat> getCatsByUser(User user);
	Map<String, Cat> getCats();

}
