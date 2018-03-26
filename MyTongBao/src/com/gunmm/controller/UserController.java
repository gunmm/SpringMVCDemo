package com.gunmm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gunmm.dao.UserDao;
import com.gunmm.dao.ZhaoBiaoDao;
import com.gunmm.impl.UserDaoImpl;
import com.gunmm.impl.ZhaoBiaoDaoImpl;
import com.gunmm.model.User;
import com.gunmm.utils.JSONUtils;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/registered")
	@ResponseBody
	private JSONObject addUser(User user) {
		System.out.println("-----------------注册用户--------------------------------");
		System.out.println(user);
		UserDao userDao = new UserDaoImpl();
		String result = userDao.addUser(user);
		if(result.equals("success")) {
			return JSONUtils.responseToJsonString("1", user, "");
		}else {
			return JSONUtils.responseToJsonString("0", "", result);
		}
	}
}
